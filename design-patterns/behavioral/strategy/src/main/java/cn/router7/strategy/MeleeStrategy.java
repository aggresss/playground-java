package cn.router7.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Melee strategy.
 */
public class MeleeStrategy implements DragonSlayingStrategy {

    private static final Logger log = LoggerFactory.getLogger(MeleeStrategy.class);

    @Override
    public void execute() {
        log.info("With your Excalibur you sever the dragon's head!");
    }
}
