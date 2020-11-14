package com.iluwatar.abstractfactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryProducerTest {

    @Test
    public void produceElfFactory_createKing_isInstanceOfElfKing() {
        KingdomFactory factory = FactoryProducer.createFactory(Kingdom.ELF);

        final King elfKing = factory.createKing();

        assertTrue(elfKing instanceof ElfKing);
        assertEquals(ElfKing.DESCRIPTION, elfKing.getDescription());
    }


    @Test
    public void produceElfFactory_createCastle_isInstanceOfElfCastle() {
        KingdomFactory factory = FactoryProducer.createFactory(Kingdom.ELF);

        final Castle castle = factory.createCastle();

        assertTrue(castle instanceof ElfCastle);
        assertEquals(ElfCastle.DESCRIPTION, castle.getDescription());
    }


    @Test
    public void produceElfFactory_createArmy_isInstanceOfElfArmy() {
        KingdomFactory factory = FactoryProducer.createFactory(Kingdom.ELF);

        final Army army = factory.createArmy();

        assertTrue(army instanceof ElfArmy);
        assertEquals(ElfArmy.DESCRIPTION, army.getDescription());
    }


    @Test
    public void produceOrcFactory_createKing_isInstanceOfOrcKing() {
        KingdomFactory factory = FactoryProducer.createFactory(Kingdom.ORC);

        final King orcKing = factory.createKing();
        assertTrue(orcKing instanceof OrcKing);
        assertEquals(OrcKing.DESCRIPTION, orcKing.getDescription());
    }



    @Test
    public void produceOrcFactory_createCastle_isInstanceOfOrcCastle() {
        KingdomFactory factory = FactoryProducer.createFactory(Kingdom.ORC);

        final Castle castle = factory.createCastle();

        assertTrue(castle instanceof OrcCastle);
        assertEquals(OrcCastle.DESCRIPTION, castle.getDescription());
    }


    @Test
    public void produceOrcFactory_createArmy_isInstanceOfOrcArmy() {
        KingdomFactory factory = FactoryProducer.createFactory(Kingdom.ORC);

        final Army army = factory.createArmy();

        assertTrue(army instanceof OrcArmy);
        assertEquals(OrcArmy.DESCRIPTION, army.getDescription());
    }

    @Test
    public void produceInvalidFactory_throwsError() {
        try {
            KingdomFactory factory = FactoryProducer.createFactory(null);
        }catch (Error e){
            assertEquals("Kingdom not yet supported!",e.getMessage());
        }

    }

}