package com.ptuor.factory.method;

public class LP extends Vinyl {

    public LP(Config config) {
        super(config);

    }

    @Override
    public String getTypeAndName() {
        String typeAndName = "LP: " + this.getName();
        return typeAndName;
    }
}
