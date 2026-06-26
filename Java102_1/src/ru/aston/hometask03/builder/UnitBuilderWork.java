package ru.aston.hometask03.builder;

public class UnitBuilderWork {
    public static void main(String[] args) {
        UnitBuilder unitBuilder = new UnitBuilder();
        unitBuilder.setUnitPartA("A");
        unitBuilder.setUnitPartA("B");
        Unit unit = unitBuilder.buildUnit();
    }
}
