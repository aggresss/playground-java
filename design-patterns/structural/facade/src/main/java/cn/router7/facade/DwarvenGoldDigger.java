package cn.router7.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DwarvenGoldDigger is one of the goldmine subsystems.
 */
public class DwarvenGoldDigger extends DwarvenMineWorker {

    private static final Logger log = LoggerFactory.getLogger(DwarvenGoldDigger.class);

    @Override
    public void work() {
        log.info("{} digs for gold.", name());
    }

    @Override
    public String name() {
        return "Dwarf gold digger";
    }
}
