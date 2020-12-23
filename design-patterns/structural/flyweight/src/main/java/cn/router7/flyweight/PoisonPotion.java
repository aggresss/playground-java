package cn.router7.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * PoisonPotion.
 */
public class PoisonPotion implements Potion {

    private static final Logger log = LoggerFactory.getLogger(PoisonPotion.class);

    @Override
    public void drink() {
        log.info("Urgh! This is poisonous. (Potion={})", System.identityHashCode(this));
    }
}
