package parser;

public class ParsingException extends RuntimeException {

    public ParsingException(int pos) {
        super("Input string doesn't match grammar at pos: " + pos);
    }
}
