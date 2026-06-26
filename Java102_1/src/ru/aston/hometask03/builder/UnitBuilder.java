package ru.aston.hometask03.builder;

public class UnitBuilder {

    private String unitPartA;
    private String unitPartB;

    public void setUnitPartB(String unitPartB) {
        this.unitPartB = unitPartB;
    }

    public void setUnitPartA(String unitPartA) {
        this.unitPartA = unitPartA;
    }

    public Unit buildUnit() {
        return new Unit(unitPartA, unitPartB);
    }
}
