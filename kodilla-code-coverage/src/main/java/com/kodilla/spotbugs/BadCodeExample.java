package com.kodilla.spotbugs;

import javax.annotation.CheckReturnValue;
import java.util.Objects;

public class BadCodeExample {
    private String type;

    public BadCodeExample(String type) {
        this.type = type;
    }

    public static double getPi() {
        return Math.PI;
    }

    @CheckReturnValue
    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BadCodeExample that = (BadCodeExample) o;
        return getType().equals(that.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType());
    }

    public static void main(String[] args) {
        BadCodeExample badCodeExample = new BadCodeExample("typeOne");
        badCodeExample.getType();
        BadCodeExample.getPi();
    }

}
