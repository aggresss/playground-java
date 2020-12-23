package cn.router7.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DwarvenTunnelDigger is one of the goldmine subsystems.
 */
public class DwarvenTunnelDigger extends DwarvenMineWorker {

    private static final Logger log = LoggerFactory.getLogger(DwarvenTunnelDigger.class);

    @Override
    public void work() {
        log.info("{} creates another promising tunnel.", name());
    }

    @Override
    public String name() {
        return "Dwarven tunnel digger";
    }
}
