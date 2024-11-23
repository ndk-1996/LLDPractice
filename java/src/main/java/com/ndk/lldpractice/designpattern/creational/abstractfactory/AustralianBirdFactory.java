package com.ndk.lldpractice.designpattern.creational.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AustralianBirdFactory implements BirdFactory {

    private static final Logger logger = LogManager.getLogger(AustralianBirdFactory.class);

    @Override
    public Eagle createEagle() {
        logger.info("Creating australian eagle");
        return new AustralianEagle();
    }

    @Override
    public Pigeon createPigeon() {
        logger.info("Creating australian pigeon");
        return new AustralianPigeon();
    }

    @Override
    public Parrot createParrot() {
        logger.info("Creating australian parrot");
        return new AustralianParrot();
    }
}
