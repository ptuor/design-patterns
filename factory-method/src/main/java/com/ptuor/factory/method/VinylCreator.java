package com.ptuor.factory.method;

public class VinylCreator {
    public static Vinyl create(Config config){
        switch (config.getType()){
            case "LP":
                return new LP(config);
            case "EP":
                return new EP(config);
            default:
                throw new Error("type does not exist");
        }
    }
}
