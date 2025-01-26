package com.ndk.lldpractice.designpattern.creational.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunExamples {

    private static final Logger logger = LogManager.getLogger(RunExamples.class);

    public static void main(String[] args) {
        logger.info("Executing abstract factory pattern examples");
        produceAndRunBird(new IndianBirdFactory());
        produceAndRunBird(new AustralianBirdFactory());
        produceAndRunBird(new BrazilianBirdFactory());
    }

    private static void produceAndRunBird(BirdFactory birdFactory) {
        Eagle eagle = birdFactory.createEagle();
        Pigeon pigeon = birdFactory.createPigeon();
        Parrot parrot = birdFactory.createParrot();

        eagle.makeSound();
        eagle.appearance();

        pigeon.makeSound();
        pigeon.appearance();

        parrot.makeSound();
        parrot.appearance();
    }
}
