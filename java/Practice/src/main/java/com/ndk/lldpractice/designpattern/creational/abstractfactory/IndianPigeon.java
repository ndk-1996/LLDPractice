package com.ndk.lldpractice.designpattern.creational.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IndianPigeon implements Pigeon {

    private static final Logger logger = LogManager.getLogger(IndianPigeon.class);

    @Override
    public void makeSound() {
        logger.info("Indian pigeon making sound");
    }

    @Override
    public void appearance() {
        logger.info("Indian pigeon appearance");
    }
}
