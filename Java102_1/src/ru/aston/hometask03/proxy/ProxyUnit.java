package ru.aston.hometask03.proxy;

public class ProxyUnit implements ShowSomeString {

    private String someString;
    private Unit unit;

    public ProxyUnit(String someString) {
        this.someString = someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    public String getSomeString() {
        return this.someString;
    }

    public void showSomeString() {
        unit = new Unit(someString);
        if (someString.isEmpty()) {
            System.out.println("Empty someString");
        } else unit.showSomeString();
    }
}
