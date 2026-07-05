package ru.aston.hometask_04;

public class Realization {

    public static void main(String[] args) {
        Wait12.wait12();
    }

    public static void liveLockRealization() {
        LiveLock liveLock = new LiveLock();
        new Thread(liveLock::work1, "T1").start();
        new Thread(liveLock::work2, "T2").start();
    }

    public static void deadLockRealization() {
        DeadLock deadLock = new DeadLock();
        new Thread(deadLock::work1, "T1").start();
        new Thread(deadLock::work2, "T2").start();
    }

}

