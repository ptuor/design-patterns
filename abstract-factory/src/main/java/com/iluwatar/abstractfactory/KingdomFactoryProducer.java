
package com.iluwatar.abstractfactory;

public class KingdomFactoryProducer {
    public static KingdomFactory getFactory(String type) {
        if(type.equalsIgnoreCase("elf")) {
            return new ElfKingdomFactory();
        } else if(type.equalsIgnoreCase("orc")) {
            return new OrcKingdomFactory();
        }
        throw new IllegalArgumentException("type \"" + type + "\" not valid");
    }
}
