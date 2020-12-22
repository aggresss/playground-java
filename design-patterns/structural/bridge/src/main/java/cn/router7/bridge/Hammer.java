package cn.router7.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hammer.
 */
public class Hammer implements Weapon {

    private static final Logger log = LoggerFactory.getLogger(Hammer.class);

    private final Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        log.info("The hammer is wielded.");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        log.info("The hammer is swinged.");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        log.info("The hammer is unwielded.");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
