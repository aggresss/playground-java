package cn.router7.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * StrengthPotion.
 */
public class StrengthPotion implements Potion {

    private static final Logger log = LoggerFactory.getLogger(StrengthPotion.class);

    @Override
    public void drink() {
        log.info("You feel strong. (Potion={})", System.identityHashCode(this));
    }
}
