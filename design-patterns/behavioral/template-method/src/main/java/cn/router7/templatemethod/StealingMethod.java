package cn.router7.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * StealingMethod defines skeleton for the algorithm.
 */
public abstract class StealingMethod {

    private static final Logger log = LoggerFactory.getLogger(StealingMethod.class);

    protected abstract String pickTarget();

    protected abstract void confuseTarget(String target);

    protected abstract void stealTheItem(String target);

    /**
     * Steal.
     */
    public void steal() {
        var target = pickTarget();
        log.info("The target has been chosen as {}.", target);
        confuseTarget(target);
        stealTheItem(target);
    }
}
