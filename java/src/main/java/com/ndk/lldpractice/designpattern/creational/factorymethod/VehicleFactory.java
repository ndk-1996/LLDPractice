package com.ndk.lldpractice.designpattern.creational.factorymethod;

import java.util.Objects;

public class VehicleFactory {

    public Vehicle createInstance(String type) {
        if (Objects.equals("Car", type)) {
            return new Car();
        } else if (Objects.equals("Motorcycle", type)) {
            return new Motorcycle();
        } else if (Objects.equals("Truck", type)) {
            return new Truck();
        }

        throw new VehicleFactoryException("Unsupported vehicle type, cannot create vehicle instance");
    }
}
