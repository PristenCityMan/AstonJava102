package ru.aston.hometask03.strategy;

public class ConcateWhithConcate implements StrategyConcate {
    @Override
    public String concateString(String a, String b) {
        return a.concat(b);
    }
}
