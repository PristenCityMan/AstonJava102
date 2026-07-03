package ru.aston.hometask_04;

public class Wait12 {

    private static boolean isFirstTurn = true;
    private static Object lock = new Object();

    public static void wait12() {

        Runnable task1 = () -> {
            while (true) {
                synchronized (lock) {
                    while (isFirstTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    System.out.println("1");
                    isFirstTurn = true;
                    lock.notifyAll();
                }
            }
        };

        Runnable task2 = () -> {
            while (true) {
                synchronized (lock) {
                    while (!isFirstTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    System.out.println("2");
                    isFirstTurn = false;
                    lock.notifyAll();
                }
            }
        };

        Thread taskThread1 = new Thread(task1);
        Thread taskThread2 = new Thread(task2);
        taskThread1.start();
        taskThread2.start();

    }
}
