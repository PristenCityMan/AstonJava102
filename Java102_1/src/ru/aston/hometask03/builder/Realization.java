package ru.aston.hometask03.builder;

public class Realization {
    public static void main(String[] args) {
        Unit unit = new Unit
                .Builder()
                .unitPartA("Part1")
                .unitPartB("Part2")
                .build();
    }
}
