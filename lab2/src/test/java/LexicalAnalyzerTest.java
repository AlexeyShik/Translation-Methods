import exception.IllegalTokenException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class LexicalAnalyzerTest {

    private static final String PATH_PREFIX = "src/main/resources/sources/";

    private void expect(List<LexicalAnalyzer.Token> tokens, LexicalAnalyzer analyzer) {
        for (LexicalAnalyzer.Token token : tokens) {
            analyzer.nextToken();
            Assertions.assertEquals(token, analyzer.getCurToken());
        }
    }

    private void test(String fileName, List<LexicalAnalyzer.Token> tokens) {
        try (InputStream is = new FileInputStream(PATH_PREFIX + fileName)) {
            expect(tokens, new LexicalAnalyzer(is));
        } catch (Exception e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }

    @Test
    public void test01VoidFile() {
        test("void.txt", List.of(LexicalAnalyzer.Token.END, LexicalAnalyzer.Token.END));
    }

    @Test
    public void test02SimpleFile() {
        test("simple.txt", List.of(
                LexicalAnalyzer.Token.VARIABLE,
                LexicalAnalyzer.Token.OR,
                LexicalAnalyzer.Token.VARIABLE,
                LexicalAnalyzer.Token.OR,
                LexicalAnalyzer.Token.VARIABLE));
    }

    @Test
    public void test03NoParenthesisFile() {
        test("no_parenthesis.txt", List.of(
                LexicalAnalyzer.Token.VARIABLE,
                LexicalAnalyzer.Token.OR,
                LexicalAnalyzer.Token.VARIABLE,
                LexicalAnalyzer.Token.AND,
                LexicalAnalyzer.Token.NEGATE,
                LexicalAnalyzer.Token.VARIABLE,
                LexicalAnalyzer.Token.XOR,
                LexicalAnalyzer.Token.VARIABLE,
                LexicalAnalyzer.Token.XOR,
                LexicalAnalyzer.Token.NEGATE,
                LexicalAnalyzer.Token.NEGATE,
                LexicalAnalyzer.Token.NEGATE,
                LexicalAnalyzer.Token.VARIABLE));
    }

    @Test
    public void test04HardFile() {
        test("hard.txt", List.of(
                LexicalAnalyzer.Token.LPAREN,
                LexicalAnalyzer.Token.LPAREN,
                LexicalAnalyzer.Token.VARIABLE,
                LexicalAnalyzer.Token.RPAREN,
                LexicalAnalyzer.Token.OR,
                LexicalAnalyzer.Token.VARIABLE,
                LexicalAnalyzer.Token.RPAREN,
                LexicalAnalyzer.Token.AND,
                LexicalAnalyzer.Token.VARIABLE,
                LexicalAnalyzer.Token.XOR,
                LexicalAnalyzer.Token.LPAREN,
                LexicalAnalyzer.Token.LPAREN,
                LexicalAnalyzer.Token.LPAREN,
                LexicalAnalyzer.Token.LPAREN,
                LexicalAnalyzer.Token.VARIABLE,
                LexicalAnalyzer.Token.RPAREN,
                LexicalAnalyzer.Token.RPAREN,
                LexicalAnalyzer.Token.RPAREN,
                LexicalAnalyzer.Token.RPAREN,
                LexicalAnalyzer.Token.AND,
                LexicalAnalyzer.Token.NEGATE,
                LexicalAnalyzer.Token.LPAREN,
                LexicalAnalyzer.Token.NEGATE,
                LexicalAnalyzer.Token.LPAREN,
                LexicalAnalyzer.Token.NEGATE,
                LexicalAnalyzer.Token.LPAREN,
                LexicalAnalyzer.Token.VARIABLE,
                LexicalAnalyzer.Token.RPAREN,
                LexicalAnalyzer.Token.OR,
                LexicalAnalyzer.Token.VARIABLE,
                LexicalAnalyzer.Token.RPAREN,
                LexicalAnalyzer.Token.RPAREN
        ));
    }

    @Test
    public void test05IllegalToken() {
        try (InputStream is = new FileInputStream(PATH_PREFIX + "illegal_token.txt")) {
            LexicalAnalyzer analyzer = new LexicalAnalyzer(is);
            analyzer.nextToken();
            Assertions.assertEquals(LexicalAnalyzer.Token.VARIABLE, analyzer.getCurToken());
            analyzer.nextToken();
            Assertions.assertEquals(LexicalAnalyzer.Token.OR, analyzer.getCurToken());
            analyzer.nextToken();
            Assertions.fail();
        } catch (IllegalTokenException ignored) {
            //  OK
        } catch (Exception e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }
}
