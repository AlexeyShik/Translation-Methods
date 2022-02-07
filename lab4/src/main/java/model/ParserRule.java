package model;

import java.util.List;

public class ParserRule implements Rule {

    private final NonTerm leftPart;
    private final List<RuleElement> rightPart;
    private String beforeFuncName;
    private String insideFuncName;
    private String afterFuncName;
    private final int insideFuncPos;

    public ParserRule(NonTerm leftPart, List<RuleElement> rightPart,
                      String beforeFuncName, String insideFuncName, String afterFuncName, int insideFuncPos) {
        this.leftPart = leftPart;
        this.rightPart = rightPart;
        this.beforeFuncName = beforeFuncName;
        this.insideFuncName = insideFuncName;
        this.afterFuncName = afterFuncName;
        this.insideFuncPos = insideFuncPos;
    }

    public NonTerm getLeftPart() {
        return leftPart;
    }

    public List<RuleElement> getRightPart() {
        return rightPart;
    }

    public String getBeforeFuncName() {
        return beforeFuncName;
    }

    public String getInsideFuncName() {
        return insideFuncName;
    }

    public String getAfterFuncName() {
        return afterFuncName;
    }

    public void setBeforeFuncName(String beforeFuncName) {
        this.beforeFuncName = beforeFuncName;
    }

    public void setInsideFuncName(String insideFuncName) {
        this.insideFuncName = insideFuncName;
    }

    public void setAfterFuncName(String afterFuncName) {
        this.afterFuncName = afterFuncName;
    }

    public int getInsideFuncPos() {
        return insideFuncPos;
    }

    @Override
    public String toString() {
        StringBuilder acc = new StringBuilder();
        rightPart.forEach(r -> acc.append(r.toString()).append("; "));
        return "Rule{" +
                "leftPart=" + leftPart +
                ", rightPart=[" + acc +
                "]}";
    }

}
