package com.ndk.lldpractice.designpattern.creational.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IndianEagle implements Eagle {

    private static final Logger logger = LogManager.getLogger(IndianEagle.class);

    @Override
    public void makeSound() {
        logger.info("Indian eagle making sound");
    }

    @Override
    public void appearance() {
        logger.info("Indian eagle appearance");
    }
}
