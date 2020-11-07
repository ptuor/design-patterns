package com.ptuor.factory.method;

public class Config {
    private String name;
    private String type;
    private String artist;

    public Config(String type, String name, String artist) {
        this.type = type;
        this.name = name;
        this.artist = artist;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }


}
