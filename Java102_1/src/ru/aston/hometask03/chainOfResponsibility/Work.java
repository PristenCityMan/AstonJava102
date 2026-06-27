package ru.aston.hometask03.chainOfResponsibility;

public interface Work {
    public void working();

    public void setNext(Work work);
}
