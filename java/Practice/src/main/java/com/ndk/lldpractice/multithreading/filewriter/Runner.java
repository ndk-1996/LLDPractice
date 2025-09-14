package com.ndk.lldpractice.multithreading.filewriter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {

    private static final Logger log = LogManager.getLogger(Runner.class);

    private static final int numOfThreads = 5;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(numOfThreads);
        List<CompletableFuture<Void>> completableFutures = new ArrayList<>();
        List<FileWriterThread> fileWriterThreads = new ArrayList<>();
        FileWriterThread fileWriterThread = new FileWriterThread();
        for (int i = 0 ; i < numOfThreads; i++) {
            fileWriterThreads.add(fileWriterThread);
            CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(fileWriterThread, executorService);
            log.info("Submitted the thread : {} for execution", i + 1);
            completableFutures.add(completableFuture);
        }

        for (int i = 0; i < numOfThreads; i++) {
            try {
                completableFutures.get(i).get();
            } catch (Exception e) {
                log.error("Error in the thread : {}", fileWriterThreads.get(i).getName(), e);
            }
        }

        executorService.shutdown();
    }
}
