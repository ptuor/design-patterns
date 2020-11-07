package com.ptuor.factory.method;

public abstract class Vinyl {
 private String name;
 private String artist;

    public Vinyl(Config config){
        this.name = config.getName();
        this.artist = config.getArtist();
    }

}
