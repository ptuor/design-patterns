package com.ptuor.factory.method;

import org.junit.Assert;
import org.junit.Test;


public class VinylCreatorTest {
    @Test
    public void createEP_isInstanceOfEP() {
        Config config = new Config("EP", "Joseph", "Looptroop");
        Vinyl ep = VinylCreator.create(config);

        Assert.assertTrue(ep instanceof EP);
    }

    @Test
    public void createEP_isNotInstanceOfLP() {
        Config config = new Config("EP", "Joseph", "Looptroop");
        Vinyl ep = VinylCreator.create(config);

        Assert.assertFalse(ep instanceof LP);
    }

    @Test
    public void createLP_isInstanceOfLP() {
        Config config = new Config("LP", "Professional Dreamers", "Looptroop");
        Vinyl lp = VinylCreator.create(config);

        Assert.assertTrue(lp instanceof LP);
    }

    @Test
    public void createLP_isNotInstanceOfEP() {
        Config config = new Config("LP", "Professional Dreamers", "Looptroop");
        Vinyl lp = VinylCreator.create(config);

        Assert.assertFalse(lp instanceof EP);
    }


    @Test
    public void createEP_getTypeAndName_returnsCorrectTypeAndName() {
        Config config = new Config("EP", "Joseph", "Looptroop");
        Vinyl vinyl = VinylCreator.create(config);

        String typeAndName = vinyl.getTypeAndName();

        Assert.assertEquals("EP: Joseph", typeAndName);
    }


    @Test
    public void createLP_getTypeAndName_returnsCorrectTypeAndName() {
        Config config = new Config("LP", "Professional Dreamers", "Looptroop");
        Vinyl vinyl = VinylCreator.create(config);

        String typeAndName = vinyl.getTypeAndName();

        Assert.assertEquals("LP: Professional Dreamers", typeAndName);
    }


    @Test
    public void createVinyl_getArtis_returnsCorrectArtist() {
        Config config = new Config("LP", "Professional Dreamers", "Looptroop");
        Vinyl vinyl = VinylCreator.create(config);

        String artist = vinyl.getArtist();

        Assert.assertEquals("Looptroop", artist);
    }

    @Test
    public void createInvalidVinyl_ThrowsError() {
        Config config = new Config("", "Professional Dreamers", "Looptroop");
        boolean isErrorThrown = false;

        try {
            Vinyl lp = VinylCreator.create(config);
        }catch (Error e){
            isErrorThrown = true;
        }
        Assert.assertTrue(isErrorThrown);
    }

}