package ru.aston.hometask;

public record MyImmutableClass(StringBuilder sbMyString) {

    public MyImmutableClass(StringBuilder sbMyString) {
        if (sbMyString == null) {
            throw new NullPointerException();
        }
        this.sbMyString = new StringBuilder(sbMyString.toString());
    }

    public StringBuilder getSbMyString() {
        if (sbMyString == null) {
            throw new NullPointerException();
        }
        return new StringBuilder(sbMyString.toString());
    }
}
