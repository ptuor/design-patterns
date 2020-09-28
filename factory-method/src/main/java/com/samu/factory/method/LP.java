package com.samu.factory.method;

/**
 * Created by sandromuggli on 13.08.17.
 */
public class LP extends Vinyl {

    Integer diameter;
    Integer numberOfSongs = 15;

    public LP(Config config, Integer diameter) {
        super(config);
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name=" + name + "]";
    }

    public int getnumberOfSongs() {
        return this.numberOfSongs;
    }
}

