package com.ndk.lldpractice.designpattern.creational.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EagerLoading {

    private static final Logger logger = LogManager.getLogger(EagerLoading.class);

    private static final EagerLoading instance = new EagerLoading();

    private EagerLoading() {
        logger.info("Singleton pattern - Eager loading example");
    }

    public static EagerLoading getInstance() {
        return instance;
    }
}
