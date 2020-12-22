package cn.router7.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Sword.
 */
public class Sword implements Weapon {

    private static final Logger log = LoggerFactory.getLogger(Sword.class);

    private final Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        log.info("The sword is wielded.");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        log.info("The sword is swinged.");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        log.info("The sword is unwielded.");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
