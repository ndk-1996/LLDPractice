package com.ndk.lldpractice.multithreading.atomicperfcheck;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    private static final Logger log = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        //perfCheckForAtomic();
        perfCheckForNonAtomic();
    }

    private static void perfCheckForAtomic() {
        AtomicPerfCheck atomicPerfCheck = new AtomicPerfCheck();
        atomicPerfCheck.executeTasks();
        log.info("AtomicLong: {}", atomicPerfCheck.getAtomicLong());
    }

    private static void perfCheckForNonAtomic() {
        NonAtomicPerfCheck nonAtomicPerfCheck = new NonAtomicPerfCheck();
        nonAtomicPerfCheck.executeTasks();
        log.info("Value: {}", nonAtomicPerfCheck.getVal());
    }
}
