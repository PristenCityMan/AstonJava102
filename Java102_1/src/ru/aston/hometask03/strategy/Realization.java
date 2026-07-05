package ru.aston.hometask03.strategy;

public class Realization {
    public static void main(String[] args) {
        String a = "a", b = "b";
        Concate concate = new Concate(new ConcateWhithPlus());
        System.out.println(concate.strategyConcate(a, b));
        concate = new Concate(new ConcateWhithConcate());
        System.out.println(concate.strategyConcate(a, b));
    }
}
