package lexer;

public class LexerException extends RuntimeException {

    public LexerException(int pos) {
        super("Input string doesn't match grammar at pos: " + pos);
    }
}
