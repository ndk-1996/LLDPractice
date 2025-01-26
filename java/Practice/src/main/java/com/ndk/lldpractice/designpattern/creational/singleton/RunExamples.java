package com.ndk.lldpractice.designpattern.creational.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunExamples {

    private static final Logger logger = LogManager.getLogger(RunExamples.class);

    public static void main(String[] args) {
        logger.info("Executing singleton pattern examples");
        EagerLoading.getInstance();
        LazyLoading.getInstance();
        BillPugh.getInstance();
    }
}
