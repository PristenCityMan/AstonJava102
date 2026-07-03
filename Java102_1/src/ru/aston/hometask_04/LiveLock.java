package ru.aston.hometask_04;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LiveLock {
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();


    public void work1() {
        while (true) {
            try {
                lock1.tryLock(1000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Lock1 acquired. Trying to acquired lock2.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (lock2.tryLock()) {
                System.out.println("Lock2 acquired");
            } else {
                System.out.println("Cant acquired lock2, unlocking lock1");
                lock1.unlock();
                continue;
            }
            break;
        }
        lock1.unlock();
        lock2.unlock();
    }

    public void work2() {
        while (true) {
            try {
                lock2.tryLock(1000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Lock2 acquired. Trying to acquired lock1.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (lock1.tryLock()) {
                System.out.println("Lock1 acquired");
            } else {
                System.out.println("Cant acquired lock1, unlocking lock2");
                lock2.unlock();
                continue;
            }
            break;
        }
        lock1.unlock();
        lock2.unlock();
    }
}
