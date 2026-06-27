package ru.aston.hometask03.proxy;

public class Unit implements ShowSomeString {


    private String someSting;


    public Unit(String someSting) {
        this.someSting = someSting;
    }


    public String getSomeString() {
        return this.someSting;
    }

    public void setSomeString(String someString) {
        this.someSting = someString;
    }

    public void showSomeString() {
        System.out.println("Unit someString: " + this.someSting);
    }

}
