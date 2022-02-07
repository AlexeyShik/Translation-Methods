package exception;

public class UnexpectedEndOfInputException extends ParsingException {

    public UnexpectedEndOfInputException(int pos) {
        super("Unexpected end of file at position = " + pos);
    }
}
