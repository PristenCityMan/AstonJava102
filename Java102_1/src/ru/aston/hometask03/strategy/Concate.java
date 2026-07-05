package ru.aston.hometask03.strategy;

public class Concate {
    private StrategyConcate strategyConcate;

    public Concate(StrategyConcate strategyConcate) {
        this.strategyConcate = strategyConcate;
    }

    public String strategyConcate(String a, String b) {
        return strategyConcate.concateString(a, b);
    }
}
