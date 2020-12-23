package cn.router7.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HitAndRunMethod implementation of {@link StealingMethod}.
 */
public class HitAndRunMethod extends StealingMethod {

    private static final Logger log = LoggerFactory.getLogger(HitAndRunMethod.class);

    @Override
    protected String pickTarget() {
        return "old goblin woman";
    }

    @Override
    protected void confuseTarget(String target) {
        log.info("Approach the {} from behind.", target);
    }

    @Override
    protected void stealTheItem(String target) {
        log.info("Grab the handbag and run away fast!");
    }
}
