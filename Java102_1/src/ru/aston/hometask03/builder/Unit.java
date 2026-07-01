package ru.aston.hometask03.builder;

public class Unit {
    private String unitPartA;
    private String unitPartB;

    public static class Builder {

        private final Unit unit;

        public Builder() {
            unit = new Unit();
        }

        public Builder unitPartA(String unitPartA) {
            unit.unitPartA = unitPartA;
            return this;
        }

        public Builder unitPartB(String unitPartB) {
            unit.unitPartB = unitPartB;
            return this;
        }

        public Unit build() {
            return unit;
        }
    }
}
