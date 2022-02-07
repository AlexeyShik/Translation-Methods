package model;

import java.util.List;

public class LexerRule implements Rule {

    private final Term leftPart;
    private final String rightPart;

    public LexerRule(Term leftPart, String rightPart) {
        this.leftPart = leftPart;
        this.rightPart = rightPart;
    }

    public Term getLeftPart() {
        return leftPart;
    }

    public String getRightPart() {
        return rightPart;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "leftPart=" + leftPart +
                ", rightPart=[" + rightPart +
                "]}";
    }

}
