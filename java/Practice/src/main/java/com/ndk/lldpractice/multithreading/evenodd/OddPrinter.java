package com.ndk.lldpractice.multithreading.evenodd;

public class OddPrinter extends Thread {

    @Override
    public void run() {
        synchronized (Runner.lock) {
            while (Runner.num < Runner.getMaxNum()) {
                if (Runner.num % 2 == 1) {
                    System.out.println(OddPrinter.class.getSimpleName() + ": " + Runner.num);
                    Runner.num++;
                    Runner.lock.notify();
                    try {
                        Runner.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        Runner.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            Runner.lock.notify();
        }
    }
}
