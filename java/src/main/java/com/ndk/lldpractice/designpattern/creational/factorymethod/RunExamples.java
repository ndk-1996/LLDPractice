package com.ndk.lldpractice.designpattern.creational.factorymethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunExamples {

    private static final Logger logger = LogManager.getLogger(RunExamples.class);

    public static void main(String[] args) {
        logger.info("Executing factory method examples");
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getInstance("Car");
        vehicle.park();

        vehicle = vehicleFactory.getInstance("Motorcycle");
        vehicle.park();

        vehicle = vehicleFactory.getInstance("Truck");
        vehicle.park();
    }
}
