package com.samu.factory.method;

/**
 * Created by sandromuggli on 13.08.17.
 */
public class EP extends Vinyl {

    Integer diameter;

    public EP(Config config, Integer diameter) {
        super(config);
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name=" + name + "]";
    }
}