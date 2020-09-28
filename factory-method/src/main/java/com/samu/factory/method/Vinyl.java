package com.samu.factory.method;

/**
 * Created by sandromuggli on 13.08.17.
 */
public abstract class Vinyl {
    String color;
    String name;
    String artist;

    public Vinyl(Config config) {
        this.color = config.getColor();
        this.name = config.getName();
        this.artist = config.getArtist();
    }
}
