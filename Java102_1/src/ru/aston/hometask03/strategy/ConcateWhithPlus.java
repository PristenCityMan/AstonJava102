package ru.aston.hometask03.strategy;

public class ConcateWhithPlus implements StrategyConcate {
    @Override
    public String concateString(String a, String b) {
        return a + b;
    }
}
