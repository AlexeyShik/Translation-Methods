package exception;

public class UnexpectedTokenException extends ParsingException {
    public UnexpectedTokenException(String message) {
        super(message);
    }
}
