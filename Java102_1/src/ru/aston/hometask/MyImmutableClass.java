package ru.aston.hometask;

public final class MyImmutableClass {

    private final StringBuilder sbMyString;

    public MyImmutableClass(StringBuilder sbMyString) {
        this.sbMyString = new StringBuilder(sbMyString.toString());
    }

    public StringBuilder getSbMyString() {
        return new StringBuilder(sbMyString.toString());
    }
}
