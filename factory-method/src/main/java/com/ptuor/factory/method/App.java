package com.ptuor.factory.method;

public class App {
    public static void main(String[] args) {
        Config config = new Config("LP", "Professional Dreamers", "Looptroop");
        Vinyl vinyl = VinylCreator.create(config);
        System.out.println(vinyl.getClass());

    }
}
