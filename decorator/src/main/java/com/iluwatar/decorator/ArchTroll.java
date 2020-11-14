package com.iluwatar.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArchTroll extends TrollDecorator {

    public ArchTroll(Troll decorated) {
        super(decorated);
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(ClubbedTroll.class);

    @Override
    public void attack() {
        super.attack();
        LOGGER.info("The troll shoots at you with an arrow!");
    }

    @Override
    public int getAttackPower() {
        return super.getAttackPower() + 10;
    }

}
