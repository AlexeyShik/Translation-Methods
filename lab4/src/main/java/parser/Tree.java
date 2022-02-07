package parser;

import java.util.List;

import static java.util.Collections.emptyList;
//  TODO: попробовать через user-defined toString в классах Utils$E выводить .value
//  TODO: арифм грамматика
//  TODO: наследуемые атрибуты
public class Tree<T> {

    final T value;
    final String name;
    final List<Tree<?>> children;

    public Tree(T value, String name) {
        this(value, name, emptyList());
    }

    public Tree(String name, List<Tree<?>> children) {
        this(null, name, children);
    }

    public Tree(T value, String name, List<Tree<?>> children) {
        this.value = value;
        this.name = name;
        this.children = children;
    }

}