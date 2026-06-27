package ru.aston.hometask03.decorator;

public class Realization {
    public static void main(String[] args) {
        InnerUnit innerUnit = new InnerUnit("Name");
        DecoratedUnit decoratedUnit = new DecoratedUnit(innerUnit);
        System.out.println(decoratedUnit.getName());
    }
}
