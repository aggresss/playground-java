package cn.router7.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SimpleTroll implements {@link Troll} interface directly.
 */
public class SimpleTroll implements Troll {

    private static final Logger log = LoggerFactory.getLogger(SimpleTroll.class);

    @Override
    public void attack() {
        log.info("The troll tries to grab you!");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        log.info("The troll shrieks in horror and runs away!");
    }
}
