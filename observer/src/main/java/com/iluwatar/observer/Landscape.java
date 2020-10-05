package com.iluwatar.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ConcreteSubject von {@link Condition}
 */
public class Landscape extends Condition{

    private static final Logger LOGGER = LoggerFactory.getLogger(Landscape.class);
    private LandScapeType currentLandScape;
    public Landscape() {
        currentLandScape = LandScapeType.HILLS;
    }

    public LandScapeType getCurrentLandScape() {
        return currentLandScape;
    }

    public void walking() {
        LandScapeType[] enumValues = LandScapeType.values();
        currentLandScape = enumValues[(currentLandScape.ordinal() + 1) % enumValues.length];
        LOGGER.info("The landscape changed to {}.", currentLandScape);
        notifyObservers(this);
    }
}
