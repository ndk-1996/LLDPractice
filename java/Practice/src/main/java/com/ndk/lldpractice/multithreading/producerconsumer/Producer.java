package com.ndk.lldpractice.multithreading.producerconsumer;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Producer extends Thread {

    private static final Logger log = LogManager.getLogger(Producer.class);

    @Override
    public void run() {
        List<String> messages = Runner.getMessages();
        Object lock = Runner.getLock();
        while (true) {
            synchronized (lock) {
                if (messages.size() == Runner.getMaxQueueSize()) {
                    log.info("Queue is full, making producer wait for consumer..");
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException("Error while producer was waiting", e);
                    }
                } else {
                    String message = RandomStringUtils.randomAlphanumeric(30);
                    messages.add(message);
                    log.info("Producer added a message : {}", message);
                    lock.notify();
                }
            }
        }
    }
}
