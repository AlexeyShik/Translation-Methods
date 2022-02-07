package model;

import java.util.*;

public class Grammar {

    private final List<ParserRule> parserRules;
    private final List<LexerRule> lexerRules;

    private final Map<RuleElement, Set<Term>> first;
    private final Map<RuleElement, Set<Term>> follow;
    private final Map<ParserRule, Set<Term>> first1;
    private final Object utilityClass;

    public Grammar(List<ParserRule> parserRules, List<LexerRule> lexerRules, Object utilityClass) {
        this.parserRules = parserRules;
        this.lexerRules = lexerRules;
        this.utilityClass = utilityClass;
        first = new HashMap<>();
        follow = new HashMap<>();
        first1 = new HashMap<>();
        calculateFirstFollow();
    }

    private void calculateFirstFollow() {
        for (ParserRule rule : parserRules) {
            first.putIfAbsent(rule.getLeftPart(), new HashSet<>());
            follow.putIfAbsent(rule.getLeftPart(), new HashSet<>());
            first1.putIfAbsent(rule, new HashSet<>());
            for (RuleElement element : rule.getRightPart()) {
                if (element instanceof Term) {
                    first.put(element, new HashSet<>());
                    first.get(element).add((Term) element);
                }
                first.putIfAbsent(element, new HashSet<>());
                follow.putIfAbsent(element, new HashSet<>());
            }
        }

        boolean changes = true;
        while (changes) {
            changes = false;
            for (ParserRule rule : parserRules) {
                RuleElement left = rule.getLeftPart();
                for (RuleElement element : rule.getRightPart()) {
                    boolean canBeEps = false;
                    for (Term term : first.get(element)) {
                        canBeEps |= term.equals(Term.EPS);
                        if (!first.get(left).contains(term)) {
                            changes = true;
                            first.get(left).add(term);
                        }
                    }
                    if (!canBeEps) {
                        break;
                    }
                }
            }
        }

        follow.get(NonTerm.E0).add(Term.END);
        changes = true;
        while (changes) {
            changes = false;
            for (ParserRule rule : parserRules) {
                RuleElement A = rule.getLeftPart();
                for (int j = 0; j < rule.getRightPart().size(); ++j) {
                    RuleElement B = rule.getRightPart().get(j);
                    if (B instanceof NonTerm) {
                        Set<Term> firstGamma = new HashSet<>();
                        boolean canBeEps = true;
                        for (int k = j + 1; k < rule.getRightPart().size() && canBeEps; ++k) {
                            firstGamma.addAll(first.get(rule.getRightPart().get(k)));
                            canBeEps = first.get(rule.getRightPart().get(k)).contains(Term.EPS);
                        }

                        Set<Term> followB = follow.get(B);
                        int sz = followB.size();
                        if (firstGamma.contains(Term.EPS) || firstGamma.isEmpty()) {
                            followB.addAll(follow.get(A));
                        }
                        firstGamma.remove(Term.EPS);
                        followB.addAll(firstGamma);
                        if (followB.size() > sz) {
                            changes = true;
                        }
                    }
                }
            }
        }

        for (ParserRule rule : parserRules) {
            Set<Term> firstAlpha = new HashSet<>();
            boolean canBeEps = true;
            for (int i = 0; i < rule.getRightPart().size() && canBeEps; ++i) {
                firstAlpha.addAll(first.get(rule.getRightPart().get(i)));
                canBeEps = first.get(rule.getRightPart().get(i)).contains(Term.EPS);
            }
            if (firstAlpha.contains(Term.EPS)) {
                first1.get(rule).addAll(follow.get(rule.getLeftPart()));
            }
            firstAlpha.remove(Term.EPS);
            first1.get(rule).addAll(firstAlpha);
        }
    }

    public List<ParserRule> getParserRules() {
        return parserRules;
    }

    public List<LexerRule> getLexerRules() {
        return lexerRules;
    }

    public Map<RuleElement, Set<Term>> getFirst() {
        return first;
    }

    public Map<RuleElement, Set<Term>> getFollow() {
        return follow;
    }

    public Map<ParserRule, Set<Term>> getFirst1() {
        return first1;
    }

    public Object getUtilityClass() {
        return utilityClass;
    }

    @Override
    public String toString() {
        StringBuilder acc = new StringBuilder();
        parserRules.forEach(r -> acc.append(r.toString()).append("; "));
        StringBuilder acc2 = new StringBuilder();
        lexerRules.forEach(r -> acc2.append(r.toString()).append("; "));

        return "Grammar{" +
                "parserRules=[" + acc + "]" +
                "lexerRules=[" + acc2 +
                "]}";
    }
}
