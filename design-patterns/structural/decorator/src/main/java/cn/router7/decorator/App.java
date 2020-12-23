package cn.router7.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
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

        // simple troll
        log.info("A simple looking troll approaches.");
        var troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        log.info("Simple troll power {}.\n", troll.getAttackPower());

        // change the behavior of the simple troll by adding a decorator
        log.info("A troll with huge club surprises you.");
        var clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        log.info("Clubbed troll power {}.\n", clubbedTroll.getAttackPower());
    }
}