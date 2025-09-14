package com.ndk.lldpractice.multithreading.producerconsumer;

import java.util.LinkedList;
import java.util.List;

public class Runner {

    private static final List<String> messages = new LinkedList<>();
    private static final int MAX_QUEUE_SIZE = 1000;
    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread producer = new Producer();
        Thread consumer = new Consumer();

        producer.start();
        consumer.start();
    }

    public static List<String> getMessages() {
        return messages;
    }

    public static int getMaxQueueSize() {
        return MAX_QUEUE_SIZE;
    }

    public static Object getLock() {
        return lock;
    }
}
