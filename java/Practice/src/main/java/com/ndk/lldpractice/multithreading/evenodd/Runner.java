package com.ndk.lldpractice.multithreading.evenodd;

public class Runner {

    public static volatile int num = 0;
    private static int MAX_NUM = 1000000000;

    public static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread oddPrinter = new OddPrinter();
        Thread evenPrinter = new EvenPrinter();

        oddPrinter.start();
        evenPrinter.start();

        oddPrinter.join();
        evenPrinter.join();
    }

    public static int getMaxNum() {
        return MAX_NUM;
    }
}
