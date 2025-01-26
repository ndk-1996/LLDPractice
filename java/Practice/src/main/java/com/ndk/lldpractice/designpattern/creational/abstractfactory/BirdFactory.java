package com.ndk.lldpractice.designpattern.creational.abstractfactory;

public interface BirdFactory {

    Eagle createEagle();
    Pigeon createPigeon();
    Parrot createParrot();
}
