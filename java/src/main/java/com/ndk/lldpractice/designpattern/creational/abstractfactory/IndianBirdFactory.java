package com.ndk.lldpractice.designpattern.creational.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IndianBirdFactory implements BirdFactory {

    private static final Logger logger = LogManager.getLogger(IndianBirdFactory.class);

    @Override
    public Eagle createEagle() {
        logger.info("Creating indian eagle");
        return new IndianEagle();
    }

    @Override
    public Pigeon createPigeon() {
        logger.info("Creating indian pigeon");
        return new IndianPigeon();
    }

    @Override
    public Parrot createParrot() {
        logger.info("Creating indian parrot");
        return new IndianParrot();
    }
}
