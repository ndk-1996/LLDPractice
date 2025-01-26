package com.ndk.lldpractice.designpattern.creational.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AustralianParrot implements Parrot {

    private static final Logger logger = LogManager.getLogger(AustralianParrot.class);

    @Override
    public void makeSound() {
        logger.info("Australian parrot making sound");
    }

    @Override
    public void appearance() {
        logger.info("Australian parrot appearance");
    }
}
