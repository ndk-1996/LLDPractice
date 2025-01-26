package com.ndk.lldpractice.designpattern.creational.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IndianParrot implements Parrot {

    private static final Logger logger = LogManager.getLogger(IndianParrot.class);

    @Override
    public void makeSound() {
        logger.info("Indian parrot making sound");
    }

    @Override
    public void appearance() {
        logger.info("Indian parrot appearance");
    }
}
