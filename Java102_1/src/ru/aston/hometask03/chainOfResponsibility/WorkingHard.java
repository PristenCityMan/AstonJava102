package ru.aston.hometask03.chainOfResponsibility;

public class WorkingHard implements Work {
    private Work work;

    public void setNext(Work work) {
        this.work = work;
    }

    public void working() {
        System.out.println("Working hard");
    }
}