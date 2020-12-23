package cn.router7.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * <p>
 * The Strategy pattern (also known as the policy pattern) is a software design
 * pattern that enables an algorithm's behavior to be selected at runtime.
 * </p>
 *
 * <p>
 * Before Java 8 the Strategies needed to be separate classes forcing the
 * developer to write lots of boilerplate code. With modern Java it is easy to
 * pass behavior with method references and lambdas making the code shorter and
 * more readable.
 * </p>
 *
 * <p>
 * In this example ({@link DragonSlayingStrategy}) encapsulates an algorithm.
 * The containing object ({@link DragonSlayer}) can alter its behavior by
 * changing its strategy.
 * </p>
 *
 */
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        // GoF Strategy pattern
        log.info("Green dragon spotted ahead!");
        var dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();
        log.info("Red dragon emerges.");
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();
        log.info("Black dragon lands before you.");
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();

        // Java 8 Strategy pattern
        log.info("Green dragon spotted ahead!");
        dragonSlayer = new DragonSlayer(() -> log.info("With your Excalibur you severe the dragon's head!"));
        dragonSlayer.goToBattle();
        log.info("Red dragon emerges.");
        dragonSlayer.changeStrategy(
                () -> log.info("You shoot the dragon with the magical crossbow and it falls dead on the ground!"));
        dragonSlayer.goToBattle();
        log.info("Black dragon lands before you.");
        dragonSlayer.changeStrategy(
                () -> log.info("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!"));
        dragonSlayer.goToBattle();
    }
}
