package com.iluwatar.abstractfactory;

public class FactoryProducer {


    public static KingdomFactory createFactory(Kingdom kingdom) {
        if ( kingdom == Kingdom.ELF) return new ElfKingdomFactory();
        if ( kingdom == Kingdom.ORC) return new OrcKingdomFactory();
        throw new Error("Kingdom not yet supported!");
    }
}
