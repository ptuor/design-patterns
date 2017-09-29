
package com.iluwatar.abstractfactory;

import com.iluwatar.abstractfactory.ElfKingdomFactory;
import com.iluwatar.abstractfactory.KingdomFactory;
import com.iluwatar.abstractfactory.OrcKingdomFactory;

public class KingdomFactoryProducer {
    public static KingdomFactory getFactory(String type) {
        if(type.equalsIgnoreCase("elf")) {
            return new ElfKingdomFactory();
        } else if(type.equalsIgnoreCase("orc")) {
            return new OrcKingdomFactory();
        }
        return null; // better throw error;)
    }
}
