package com.samu.factory.method;

/**
 * Created by sandromuggli on 13.08.17.
 */
public class Config {
    String color;
    String name;
    String artist;
    String type;

    public Config(String color, String name, String artist, String type) {
        this.color = color;
        this.name = name;
        this.artist = artist;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
