package exception;

public class IllegalTokenException extends ParsingException {

    public IllegalTokenException(char token, int pos) {
        super("Illegal token = " + token + ", found at position = " + pos);
    }
}
