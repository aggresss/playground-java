package cn.router7.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App implements Runnable
{
    private static Logger log = LoggerFactory.getLogger(App.class);

    private final Kingdom kingdom = new Kingdom();

    public Kingdom getKingdom() {
        return kingdom;
    }
    public static void main( String[] args )
    {
        var app = new App();
        app.run();
    }

    @Override
    public void run() {
        log.info("Elf Kingdom");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        log.info(kingdom.getArmy().getDescription());
        log.info(kingdom.getCastle().getDescription());
        log.info(kingdom.getKing().getDescription());

        log.info("Orc Kingdom");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        log.info(kingdom.getArmy().getDescription());
        log.info(kingdom.getCastle().getDescription());
        log.info(kingdom.getKing().getDescription());
    }

    public void createKingdom(final Kingdom.FactoryMaker.KingdomType kingdomType) {
        final KingdomFactory kingdomFactory = Kingdom.FactoryMaker.makeFactory(kingdomType);
        kingdom.setKing(kingdomFactory.createKing());
        kingdom.setCastle(kingdomFactory.createCastle());
        kingdom.setArmy(kingdomFactory.createArmy());
    }
}
