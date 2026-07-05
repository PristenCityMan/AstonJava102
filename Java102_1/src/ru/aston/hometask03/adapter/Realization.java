package ru.aston.hometask03.adapter;

public class Realization {
    public static void main(String[] args) {
        NotText notText = new NotText(33);
        NotTextAdaptingToText notTextAdaptingToText = new NotTextAdaptingToText(notText);
        notTextAdaptingToText.showText();

    }
}
