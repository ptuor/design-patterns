package com.samu.factory.method;

/**
 * Created by sandromuggli on 13.08.17.
 */
public class VinylCreator {

    public static Vinyl create(Config config) {
        switch (config.type) {
            case "LP":
                return new LP(config, 4);
            case "EP":
                return new EP(config, 5);
            default:
                throw new Error("vinyl type not existing");
        }
    }
}
