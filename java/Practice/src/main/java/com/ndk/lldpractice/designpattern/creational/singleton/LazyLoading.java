package com.ndk.lldpractice.designpattern.creational.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LazyLoading {

    private static final Logger logger = LogManager.getLogger(LazyLoading.class);

    private static volatile LazyLoading instance;

    private LazyLoading() {
        logger.info("Singleton pattern - Lazy loading example");
    }

    public static LazyLoading getInstance() {
        if (instance == null) {
            synchronized (LazyLoading.class) {
                if (instance == null) {
                    instance = new LazyLoading();
                }
            }
        }

        return instance;
    }
}
