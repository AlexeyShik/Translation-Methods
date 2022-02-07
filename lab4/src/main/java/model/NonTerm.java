package model;

import java.util.Objects;

public class NonTerm implements RuleElement {

    public static final NonTerm E0 = new NonTerm("E0", false);

    private final String name;
    private final boolean inherited;

    public NonTerm(String name, boolean inherited) {
        this.name = name;
        this.inherited = inherited;
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean isInherited() {
        return inherited;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NonTerm nonTerm = (NonTerm) o;
        return Objects.equals(name, nonTerm.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
