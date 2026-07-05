package ru.aston.hometask03.chainOfResponsibility;

public class Realization {
    public static void main(String[] args) {
        Work hardWork = new WorkingHard();
        Work notHardWork = new WorkingNotSoHard();
        hardWork.setNext(notHardWork);
        hardWork.working();
    }
}
