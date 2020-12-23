package cn.router7.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DwarvenCartOperator is one of the goldmine subsystems.
 */
public class DwarvenCartOperator extends DwarvenMineWorker {

    private static final Logger log = LoggerFactory.getLogger(DwarvenCartOperator.class);

    @Override
    public void work() {
        log.info("{} moves gold chunks out of the mine.", name());
    }

    @Override
    public String name() {
        return "Dwarf cart operator";
    }
}
