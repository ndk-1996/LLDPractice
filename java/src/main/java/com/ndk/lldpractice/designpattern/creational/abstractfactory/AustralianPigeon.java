package com.ndk.lldpractice.designpattern.creational.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AustralianPigeon implements Pigeon {

    private static final Logger logger = LogManager.getLogger(AustralianPigeon.class);

    @Override
    public void makeSound() {
        logger.info("Australian pigeon making sound");
    }

    @Override
    public void appearance() {
        logger.info("Australian pigeon appearance");
    }
}
