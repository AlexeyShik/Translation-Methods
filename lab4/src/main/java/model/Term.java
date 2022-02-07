package model;

import java.util.Objects;

public class Term implements RuleElement {

    public static final Term EPS = new Term("\\\\eps");
    public static final Term END = new Term("\\\\$");

    private final String value;

    public Term(String value) {
        this.value = value;
    }

    @Override
    public String getName() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Term term = (Term) o;
        return Objects.equals(value, term.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
