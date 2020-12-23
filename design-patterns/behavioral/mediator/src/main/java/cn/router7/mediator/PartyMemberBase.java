package cn.router7.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract base class for party members.
 */
public abstract class PartyMemberBase implements PartyMember {

    private static final Logger log = LoggerFactory.getLogger(PartyMemberBase.class);

    protected Party party;

    @Override
    public void joinedParty(Party party) {
        log.info("{} joins the party", this);
        this.party = party;
    }

    @Override
    public void partyAction(Action action) {
        log.info("{} {}", this, action.getDescription());
    }

    @Override
    public void act(Action action) {
        if (party != null) {
            log.info("{} {}", this, action);
            party.act(this, action);
        }
    }

    @Override
    public abstract String toString();

}
