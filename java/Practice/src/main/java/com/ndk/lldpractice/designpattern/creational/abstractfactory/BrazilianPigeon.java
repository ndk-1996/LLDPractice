package com.ndk.lldpractice.designpattern.creational.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BrazilianPigeon implements Pigeon {

    private static final Logger logger = LogManager.getLogger(BrazilianPigeon.class);

    @Override
    public void makeSound() {
        logger.info("Brazilian pigeon making sound");
    }

    @Override
    public void appearance() {
        logger.info("Brazilian pigeon appearance");
    }
}
