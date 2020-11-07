package com.ptuor.factory.method;

public class EP extends Vinyl {

    public EP(Config config){
        super(config);
    }

    @Override
    public String getTypeAndName() {
        String typeAndName = "EP: " + this.getName();
        return typeAndName;
    }

}
