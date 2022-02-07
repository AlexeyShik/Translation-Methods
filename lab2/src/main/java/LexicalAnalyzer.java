import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import exception.IllegalTokenException;
import exception.UnexpectedEndOfInputException;

import java.io.IOException;
import java.io.InputStream;

public class LexicalAnalyzer {

    enum Token {
        VARIABLE,
        AND,
        OR,
        XOR,
        NEGATE,
        LPAREN,
        RPAREN,
        END
    }

    static final BiMap<Character, Token> CHARACTER_TOKEN_MAP = new ImmutableBiMap.Builder<Character, Token>()
            .put('&', Token.AND)
            .put('|', Token.OR)
            .put('^', Token.XOR)
            .put('!', Token.NEGATE)
            .put('(', Token.LPAREN)
            .put(')', Token.RPAREN)
            .put((char) -1, Token.END)
            .put('v', Token.VARIABLE)
            .build();

    private final InputStream is;
    private char curChar;
    private int curPos;
    private Token curToken;

    public LexicalAnalyzer(InputStream is) {
        this.is = is;
        curPos = 0;
        nextChar();
    }

    private boolean isBlank() {
        return Character.isWhitespace(curChar);
    }

    private void nextChar() {
        ++curPos;
        try {
            curChar = (char) is.read();
        } catch (IOException e) {
            throw new UnexpectedEndOfInputException(curPos);
        }
    }

    public void nextToken() {
        while (isBlank()) {
            nextChar();
        }
        if (Character.isLetter(curChar)) {
            curToken = Token.VARIABLE;
            nextChar();
        } else if (CHARACTER_TOKEN_MAP.containsKey(curChar)) {
            curToken = CHARACTER_TOKEN_MAP.get(curChar);
            if (curToken != Token.END) {
                nextChar();
            }
        } else {
            throw new IllegalTokenException(curChar, curPos);
        }
    }

    public int getCurPos() {
        return curPos;
    }

    public Token getCurToken() {
        return curToken;
    }
}
