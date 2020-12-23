package cn.router7.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The object to be proxied.
 */
public class IvoryTower implements WizardTower {

    private static final Logger log = LoggerFactory.getLogger(IvoryTower.class);

    public void enter(Wizard wizard) {
        log.info("{} enters the tower.", wizard);
    }

}