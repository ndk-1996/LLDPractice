package com.ndk.lldpractice.designpattern.creational.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AustralianEagle implements Eagle {

    private static final Logger logger = LogManager.getLogger(AustralianEagle.class);

    @Override
    public void makeSound() {
        logger.info("Australian eagle making sound");
    }

    @Override
    public void appearance() {
        logger.info("Australian eagle appearance");
    }
}
