package ru.aston.hometask03.builder;

public class Unit {
    private String unitPartA;
    private String unitPartB;

    public Unit(String unitPartA, String unitPartB) {
        this.unitPartA = unitPartA;
        this.unitPartB = unitPartB;
    }

    public String getUnitPartA() {
        return unitPartA;
    }

    public String getUnitPartB() {
        return unitPartB;
    }
}
