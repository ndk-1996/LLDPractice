package com.ndk.lldpractice.designpattern.creational.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BrazilianBirdFactory implements BirdFactory {

    private static final Logger logger = LogManager.getLogger(BrazilianBirdFactory.class);

    @Override
    public Eagle createEagle() {
        logger.info("Creating brazilian eagle");
        return new BrazilianEagle();
    }

    @Override
    public Pigeon createPigeon() {
        logger.info("Creating brazilian pigeon");
        return new BrazilianPigeon();
    }

    @Override
    public Parrot createParrot() {
        logger.info("Creating brazilian parrot");
        return new BrazilianParrot();
    }
}
