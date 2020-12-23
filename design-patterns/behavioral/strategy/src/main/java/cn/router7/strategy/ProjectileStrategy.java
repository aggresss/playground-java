package cn.router7.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Projectile strategy.
 */
public class ProjectileStrategy implements DragonSlayingStrategy {

    private static final Logger log = LoggerFactory.getLogger(ProjectileStrategy.class);

    @Override
    public void execute() {
        log.info("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
    }
}
