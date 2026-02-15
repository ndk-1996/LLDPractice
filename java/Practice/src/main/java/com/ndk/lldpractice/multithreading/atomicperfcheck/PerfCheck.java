package com.ndk.lldpractice.multithreading.atomicperfcheck;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public abstract class PerfCheck {

    private static final Logger log = LogManager.getLogger(PerfCheck.class);

    protected static final int numThreads = 10;
    protected static final int numTimes = 10000000;

    protected abstract Runnable getTask();

    public void executeTasks() {
        long startTime = System.currentTimeMillis();
        log.info("Executing tasks to check performance of: {}", this.getClass().getSimpleName());
        try (ExecutorService executorService = Executors.newFixedThreadPool(numThreads)) {
            List<Future<?>> futures = new ArrayList<>();
            for (int i = 0; i < numThreads; i++) {
                futures.add(executorService.submit(getTask()));
            }
            log.info("Submitted all tasks to check performance of: {}", this.getClass().getSimpleName());
            executorService.shutdown();
            while (!executorService.isTerminated()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    log.error("Error while waiting in main thread");
                }
            }

            for (Future<?> future : futures) {
                try {
                    future.get();
                } catch (Exception e) {
                    log.error("Error in one of the task", e);
                }
            }
            log.info("All tasks completed successfully");
            long endTime = System.currentTimeMillis();

            double timeTaken = (double) (endTime - startTime) / 1000;

            log.info("Total time taken for: {} is: {}", this.getClass().getSimpleName(), timeTaken);
        }
    }
}
