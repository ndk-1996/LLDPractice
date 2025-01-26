package com.ndk.lldpractice.designpattern.creational.factorymethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Truck extends Vehicle {

    private static final Logger logger = LogManager.getLogger(Truck.class);

    @Override
    public void park() {
        logger.info("Parking a truck");
    }
}
