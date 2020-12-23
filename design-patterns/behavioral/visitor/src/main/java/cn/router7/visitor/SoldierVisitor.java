package cn.router7.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SoldierVisitor.
 */
public class SoldierVisitor implements UnitVisitor {

    private static final Logger log = LoggerFactory.getLogger(SoldierVisitor.class);

    @Override
    public void visitSoldier(Soldier soldier) {
        log.info("Greetings {}", soldier);
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        // Do nothing
    }

    @Override
    public void visitCommander(Commander commander) {
        // Do nothing
    }
}
