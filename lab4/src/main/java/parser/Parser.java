package parser;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lexer.Lexer;
import model.*;

public class Parser {

    private final Grammar grammar;

    private Lexer lexer;

    public Parser(Grammar grammar) {
        this.grammar = grammar;
    }

    public Tree<?> parse(InputStream is) {
        if (is == null) {
            throw new RuntimeException("Expected non null inputSteam");
        }
        lexer = new Lexer(is, grammar);
        return parseElement(NonTerm.E0, new ArrayList<>());
    }

    private Tree<?> parseTerm(Term element) {
        if (element.equals(Term.EPS)) {
            return new Tree<>(Term.EPS.getName(), Term.EPS.getName());
        }
        Tree<?> tree = new Tree<>(lexer.getCurToken().getValue(), lexer.getCurToken().getTerminal().getName());
        lexer.nextToken();
        return tree;
    }

    private Tree<?> processRule(ParserRule rule, ArrayList<NonTerm> stack,
                                List<NonTerm> inherited, String elementName) {
        NonTerm left = getNonTerm(rule.getLeftPart().getName());
        List<NonTerm> args = new ArrayList<>();
        List<Class<?>> paramClasses = new ArrayList<>();
        args.add(left);
        paramClasses.add(left.getClass());

        List<Tree<?>> children = new ArrayList<>();
        int pos = 0;
        for (RuleElement e : rule.getRightPart()) {

            if (pos == rule.getInsideFuncPos()) {
                args.addAll(inherited);
                paramClasses.addAll(inherited.stream().map(NonTerm::getClass).collect(Collectors.toList()));
                Object[] arguments = args.toArray(Object[]::new);
                try {
                    grammar.getUtilityClass().getClass()
                            .getDeclaredMethod(rule.getInsideFuncName(), paramClasses.toArray(Class<?>[]::new))
                            .invoke(grammar.getUtilityClass(), arguments);
                } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException illegalAccessException) {
                    throw new ParsingException(lexer.getCurPos());
                }
                if (!stack.isEmpty()) {
                    args = args.subList(0, args.size() - 1);
                    paramClasses = paramClasses.subList(0, args.size());
                }
            }

            ++pos;
            children.add(parseElement(e, stack));
            if (e instanceof NonTerm) {
                NonTerm curr = getNonTerm(e.getName());
                paramClasses.add(curr.getClass());
                if (curr.isInherited()) {
                    stack.add((NonTerm) children.get(children.size() - 1).value);
                }
                args.add((NonTerm) children.get(children.size() - 1).value);
            }
        }

        if (rule.getAfterFuncName() != null) {
            try {
                Object[] arguments;
                if (paramClasses.size() == 1
                        && rule.getRightPart().size() == 1) {  // rule A -> c
                    args.addAll(inherited);
                    paramClasses.addAll(inherited.stream().map(NonTerm::getClass).collect(Collectors.toList()));
                    if (inherited.isEmpty()) {
                        paramClasses.add(String.class);
                        arguments = Stream.concat(Arrays.stream(args.toArray(Object[]::new)), Arrays.stream(new Object[] {children.get(0).value})).toArray();
                    } else {
                        arguments = args.toArray();
                    }
                } else {
                    args.addAll(inherited);
                    paramClasses.addAll(inherited.stream().map(NonTerm::getClass).collect(Collectors.toList()));
                    arguments = args.toArray(Object[]::new);
                }
                grammar.getUtilityClass().getClass()
                        .getDeclaredMethod(rule.getAfterFuncName(), paramClasses.toArray(Class<?>[]::new))
                        .invoke(grammar.getUtilityClass(), arguments);
            } catch (Exception e) {
                throw new ParsingException(lexer.getCurPos());
            }
        }
        return new Tree<>(left, elementName, children);
    }

    private Tree<?> parseElement(RuleElement element, ArrayList<NonTerm> stack) {
        if (element instanceof Term) {
            return parseTerm((Term) element);
        }
        List<NonTerm> inherited = new ArrayList<>();
        if (!stack.isEmpty()) {
            inherited.add(stack.get(stack.size() - 1));
            stack.remove(stack.size() - 1);
        }
        Token token = lexer.getCurToken();
        for (var entry : grammar.getFirst1().entrySet()) {
            ParserRule rule = entry.getKey();
            if (!rule.getLeftPart().equals(element)) {
                continue;
            }
            if (entry.getValue().contains(token.getTerminal())) {
                return processRule(rule, stack, inherited, element.getName());
            }
        }
        if (!element.getName().equals("E0")) {
            throw new ParsingException(lexer.getCurPos());
        }
        return new Tree<>("E0", "E0");
    }

    private NonTerm getNonTerm(String name) {
        try {
            return (NonTerm) Arrays.stream(grammar.getUtilityClass().getClass().getDeclaredClasses())
                    .filter(x -> x.getName().equals("parser.Utils$" + name))
                    .findFirst()
                    .orElseThrow(() -> new ParsingException(lexer.getCurPos()))
                    .getDeclaredConstructor()
                    .newInstance();
        } catch (Exception e) {
            throw new ParsingException(lexer.getCurPos());
        }
    }

}
