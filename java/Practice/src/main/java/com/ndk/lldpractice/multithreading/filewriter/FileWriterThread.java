package com.ndk.lldpractice.multithreading.filewriter;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class FileWriterThread extends Thread {

    private static final Logger log = LogManager.getLogger(FileWriterThread.class);

    private static final String filePath = "./";
    private static final String fileName = "multiFileWriter.txt";
    private static final int numOfLinesInFile = 10000000;

    @Override
    public void run() {
        File file = new File(filePath + fileName);
        createFile(file);
        writeToFile(file);
    }

    private synchronized void createFile(File file) {
        boolean fileCreated;
        if (!file.exists()) {
            try {
                fileCreated = file.createNewFile();
                log.info("File creation success: {}", fileCreated);
            } catch (IOException e) {
                throw new RuntimeException("Error while creating a new file for: " + fileName , e);
            }
        }
    }

    private synchronized void writeToFile(File file) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            log.info("Thread : {} has started writing to the file", Thread.currentThread().getName());
            for (int i = 0; i < numOfLinesInFile; i++) {
                String message = RandomStringUtils.randomAlphanumeric(30);
                message = message + " - " + Thread.currentThread().getName() + "\n";
                bufferedWriter.write(message);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error while file operation", e);
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close(); // This will take care of flushing the buffer.
                } catch (IOException e) {
                    log.error("Error while flushing/closing the writer", e);
                }
            }
        }
        log.info("Thread : {} has completed writing to the file", Thread.currentThread().getName());
    }
}
