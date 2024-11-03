package com.ndk.lldpractice.designpattern.creational.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BillPugh {

    private static final Logger logger = LogManager.getLogger(BillPugh.class);

    private BillPugh() {
        logger.info("Singleton pattern - Bill Pugh example");
    }

    private static final class Helper {
        private static final BillPugh instance = new BillPugh();
    }

    public static BillPugh getInstance() {
        return Helper.instance;
    }
}
