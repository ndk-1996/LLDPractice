package com.ndk.lldpractice.designpattern.creational.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BrazilianEagle implements Eagle {

    private static final Logger logger = LogManager.getLogger(BrazilianEagle.class);

    @Override
    public void makeSound() {
        logger.info("Brazilian eagle making sound");
    }

    @Override
    public void appearance() {
        logger.info("Brazilian eagle appearance");
    }
}
