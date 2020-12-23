package cn.router7.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * InvisibilityPotion.
 */
public class InvisibilityPotion implements Potion {

    private static final Logger log = LoggerFactory.getLogger(InvisibilityPotion.class);

    @Override
    public void drink() {
        log.info("You become invisible. (Potion={})", System.identityHashCode(this));
    }
}
