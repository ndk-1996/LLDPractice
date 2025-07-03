package com.ndk.lldpractice.multithreading;

public class OddPrinter extends Thread {

    @Override
    public void run() {
        synchronized (OddEvenPrinter.lock) {
            while (OddEvenPrinter.num < OddEvenPrinter.getMaxNum()) {
                if (OddEvenPrinter.num % 2 == 1) {
                    System.out.println(OddPrinter.class.getSimpleName() + ": " + OddEvenPrinter.num);
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
