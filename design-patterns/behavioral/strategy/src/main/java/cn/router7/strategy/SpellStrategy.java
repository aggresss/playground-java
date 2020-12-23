package cn.router7.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Spell strategy.
 */
public class SpellStrategy implements DragonSlayingStrategy {

    private static final Logger log = LoggerFactory.getLogger(SpellStrategy.class);

    @Override
    public void execute() {
        log.info("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
    }

}
