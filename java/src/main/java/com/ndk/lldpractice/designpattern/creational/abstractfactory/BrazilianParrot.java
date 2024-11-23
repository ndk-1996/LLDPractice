package com.ndk.lldpractice.designpattern.creational.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BrazilianParrot implements Parrot {

    private static final Logger logger = LogManager.getLogger(BrazilianParrot.class);

    @Override
    public void makeSound() {
        logger.info("Brazilian parrot making sound");
    }

    @Override
    public void appearance() {
        logger.info("Brazilian parrot appearance");
    }
}
