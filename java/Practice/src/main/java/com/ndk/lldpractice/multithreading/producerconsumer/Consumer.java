package com.ndk.lldpractice.multithreading.producerconsumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Consumer extends Thread {

    private static final Logger log = LogManager.getLogger(Consumer.class);

    @Override
    public void run() {
        List<String> messages = Runner.getMessages();
        Object lock = Runner.getLock();
        while (true) {
            synchronized (lock) {
                if (messages.isEmpty()) {
                    log.info("Queue is empty, making consumer wait for producer..");
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException("Error while consumer was waiting", e);
                    }
                } else {
                    String message = messages.removeFirst();
                    log.info("Consumed message from the queue : {}", message);
                    lock.notify();
                }
            }
        }
    }
}
