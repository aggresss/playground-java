package cn.router7.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CommanderVisitor.
 */
public class CommanderVisitor implements UnitVisitor {

    private static final Logger log = LoggerFactory.getLogger(CommanderVisitor.class);

    @Override
    public void visitSoldier(Soldier soldier) {
        // Do nothing
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        // Do nothing
    }

    @Override
    public void visitCommander(Commander commander) {
        log.info("Good to see you {}", commander);
    }
}
