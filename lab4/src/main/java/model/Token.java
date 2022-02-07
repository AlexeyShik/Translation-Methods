package model;

public class Token {

    public static final Token END = new Token(Term.END, "EOF");

    private final Term terminal;
    private final String value;

    public Token(Term terminal, String value) {
        this.terminal = terminal;
        this.value = value;
    }

    public Term getTerminal() {
        return terminal;
    }

    public String getValue() {
        return value;
    }
}
