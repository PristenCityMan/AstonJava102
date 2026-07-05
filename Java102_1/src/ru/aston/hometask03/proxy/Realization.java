package ru.aston.hometask03.proxy;

public class Realization {
    public static void main(String[] args) {
        String someString = new String();
        ProxyUnit proxyUnit = new ProxyUnit(someString);
        proxyUnit.showSomeString();
    }
}
