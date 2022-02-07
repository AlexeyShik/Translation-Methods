import exception.ParsingException;
import exception.UnexpectedTokenException;

import java.io.InputStream;
import java.util.List;

import static java.util.Collections.singletonList;
import static java.util.Collections.emptyList;

public class Parser {

    private static final String EPS = "eps";

    public static class Tree {

        final String value;
        final List<Tree> children;

        public Tree(String value) {
            this(value, emptyList());
        }

        public Tree(String value, List<Tree> children) {
            this.value = value;
            this.children = children;
        }
    }

    private LexicalAnalyzer analyzer;

    private void expectRParenthesis() {
        if (LexicalAnalyzer.Token.RPAREN != analyzer.getCurToken()) {
            throw new UnexpectedTokenException("Expected token " + LexicalAnalyzer.Token.RPAREN.name() + ", found "
                    + analyzer.getCurToken() + " at position " + analyzer.getCurPos());
        }
    }

    private Tree E0() {
        if (analyzer.getCurToken() == LexicalAnalyzer.Token.END) {
            return genEpsTree("E0");
        }
        return new Tree("E0", singletonList(E()));
    }

    private Tree E() {
        return new Tree("E", List.of(T(), E1()));
    }

    private Tree genEpsTree(String name) {
        return new Tree(name, singletonList(new Tree(EPS)));
    }

    private Tree treeFromToken(LexicalAnalyzer.Token token) {
        return new Tree(LexicalAnalyzer.CHARACTER_TOKEN_MAP.inverse().get(token).toString());
    }

    private Tree E1() {
        LexicalAnalyzer.Token token = analyzer.getCurToken();
        if (token == LexicalAnalyzer.Token.OR) {
            analyzer.nextToken();
            return new Tree("E1", List.of(treeFromToken(token), E()));
        }
        return genEpsTree("E1");
    }

    private Tree T() {
        return new Tree("T", List.of(F(), T1()));
    }

    private Tree T1() {
        LexicalAnalyzer.Token token = analyzer.getCurToken();
        if (token == LexicalAnalyzer.Token.XOR) {
            analyzer.nextToken();
            return new Tree("T1", List.of(treeFromToken(token), F(), T1()));
        }
        return genEpsTree("T1");
    }

    private Tree F() {
        return new Tree("F", List.of(G(), F1()));
    }

    private Tree F1() {
        LexicalAnalyzer.Token token = analyzer.getCurToken();
        if (token == LexicalAnalyzer.Token.AND) {
            analyzer.nextToken();
            return new Tree("F1", List.of(treeFromToken(token), G(), F1()));
        }
        return genEpsTree("F1");
    }

    private Tree G() {
        LexicalAnalyzer.Token token = analyzer.getCurToken();
        if (token.equals(LexicalAnalyzer.Token.NEGATE)) {
            analyzer.nextToken();
            return new Tree("G", List.of(treeFromToken(token), H()));
        }
        return new Tree("G", List.of(H()));
    }

    private Tree H() {
        LexicalAnalyzer.Token token = analyzer.getCurToken();
        return switch (token) {
            case VARIABLE -> {
                analyzer.nextToken();
                yield new Tree("H", List.of(treeFromToken(token), E()));
            }
            case LPAREN -> {
                analyzer.nextToken();
                Tree left = treeFromToken(token);
                Tree middle = E();
                expectRParenthesis();
                analyzer.nextToken();
                yield new Tree("H", List.of(left, middle, treeFromToken(LexicalAnalyzer.Token.RPAREN)));
            }
            default -> genEpsTree("H");
        };
    }

    public Tree parse(InputStream is) {
        if (is == null) {
            throw new ParsingException("Expected non null inputSteam");
        }
        analyzer = new LexicalAnalyzer(is);
        analyzer.nextToken();
        Tree ans = E0();
        if (LexicalAnalyzer.Token.END != analyzer.getCurToken()) {
            throw new UnexpectedTokenException("Expected end of input, found " + analyzer.getCurToken()
                    + " at position " + analyzer.getCurPos());
        }
        return ans;
    }
}
