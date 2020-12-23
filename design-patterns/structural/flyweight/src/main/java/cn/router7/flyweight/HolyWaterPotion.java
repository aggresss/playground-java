package cn.router7.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HolyWaterPotion.
 */
public class HolyWaterPotion implements Potion {

    private static final Logger log = LoggerFactory.getLogger(HolyWaterPotion.class);

    @Override
    public void drink() {
        log.info("You feel blessed. (Potion={})", System.identityHashCode(this));
    }
}
