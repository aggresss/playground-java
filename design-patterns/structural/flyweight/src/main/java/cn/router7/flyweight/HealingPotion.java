package cn.router7.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HealingPotion.
 */
public class HealingPotion implements Potion {

    private static final Logger log = LoggerFactory.getLogger(HealingPotion.class);

    @Override
    public void drink() {
        log.info("You feel healed. (Potion={})", System.identityHashCode(this));
    }
}
