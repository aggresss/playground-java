package cn.router7.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The proxy controlling access to the {@link IvoryTower}.
 */
public class WizardTowerProxy implements WizardTower {

    private static final Logger log = LoggerFactory.getLogger(WizardTowerProxy.class);

    private static final int NUM_WIZARDS_ALLOWED = 3;

    private int numWizards;

    private final WizardTower tower;

    public WizardTowerProxy(WizardTower tower) {
        this.tower = tower;
    }

    @Override
    public void enter(Wizard wizard) {
        if (numWizards < NUM_WIZARDS_ALLOWED) {
            tower.enter(wizard);
            numWizards++;
        } else {
            log.info("{} is not allowed to enter!", wizard);
        }
    }
}
