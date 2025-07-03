package com.ndk.lldpractice.multithreading;

public class EvenPrinter extends Thread {

    @Override
    public void run() {
        synchronized (OddEvenPrinter.lock) {
            while (OddEvenPrinter.num < OddEvenPrinter.getMaxNum()) {
                if (OddEvenPrinter.num % 2 == 0) {
                    System.out.println(EvenPrinter.class.getSimpleName() + ": " + OddEvenPrinter.num);
                    OddEvenPrinter.num++;
                    OddEvenPrinter.lock.notify();
                    try {
                        OddEvenPrinter.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        OddEvenPrinter.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            OddEvenPrinter.lock.notify();
        }
    }
}
