package com.ndk.lldpractice.designpattern.creational.factorymethod;

public class VehicleFactory {

    public Vehicle getInstance(String type) {
        if (type.equals("Car")) {
            return new Car();
        } else if (type.equals("Motorcycle")) {
            return new Motorcycle();
        } else if (type.equals("Truck")) {
            return new Truck();
        }

        throw new RuntimeException("unsupported vehicle type");
    }
}
