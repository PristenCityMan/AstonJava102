package ru.aston.hometask03.adapter;

public class Text {
    public String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void showText() {
        System.out.println(this.text);
    }
}
