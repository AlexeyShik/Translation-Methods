package lexer;

import model.Grammar;
import model.LexerRule;
import model.Token;

import java.io.IOException;
import java.io.InputStream;

public class Lexer {

    private static final String REGEXP = "\\\\reg";

    private final InputStream is;
    private Token curToken;
    private char curChar;
    private int curPos;
    private final Grammar grammar;
    private boolean readTooMuch;

    public Lexer(InputStream is, Grammar grammar) {
        this.is = is;
        this.grammar = grammar;
        this.readTooMuch = false;
        curPos = 0;
        nextToken();
    }

    private void read() throws IOException {
        ++curPos;
        curChar = (char) is.read();
        if (curChar == (char) -1) {
            curToken = Token.END;
        }
    }

    private boolean isWhitespace() {
        return Character.isWhitespace(curChar);
    }

    public void nextToken() {
        try {
            do {
                if (!readTooMuch) {
                    read();
                } else {
                    readTooMuch = false;
                }
            } while (isWhitespace());

            String accum = String.valueOf(curChar);
            for (LexerRule rule : grammar.getLexerRules()) {
                if (rule.getRightPart().startsWith(REGEXP)) {
                    String regexp = rule.getRightPart().replace("\\\\reg", "");
                    if (accum.matches(regexp)) {
                        while (accum.matches(regexp)) {
                            read();
                            accum += curChar;
                        }
                        readTooMuch = true;
                        accum = accum.substring(0, accum.length() - 1);
                        curToken = new Token(rule.getLeftPart(), accum);
                    }
                } else {
                    if (rule.getRightPart().startsWith(accum)) {
                        for (int i = 1; i < rule.getRightPart().length(); ++i) {
                            read();
                            accum += curChar;
                            if (!rule.getRightPart().startsWith(accum)) {
                                throw new LexerException(getCurPos());
                            }
                        }
                        curToken = new Token(rule.getLeftPart(), accum);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Unexpected end of input at pos: " + curPos);
        }
    }

    public int getCurPos() {
        return curPos;
    }

    public Token getCurToken() {
        return curToken;
    }

}
