package com.ndk.lldpractice.designpattern.creational.factorymethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Car extends Vehicle {

    private static final Logger logger = LogManager.getLogger(Car.class);

    @Override
    public void park() {
        logger.info("Parking a car");
    }
}
