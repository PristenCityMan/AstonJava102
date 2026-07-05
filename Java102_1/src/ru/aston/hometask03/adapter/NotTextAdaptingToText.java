package ru.aston.hometask03.adapter;

public class NotTextAdaptingToText extends Text {

    private NotText notText;

    public NotTextAdaptingToText(NotText notText) {
        super(String.valueOf(notText.getNum()));
        this.notText = notText;
    }

    @Override
    public void showText() {
        super.showText();
    }
}
