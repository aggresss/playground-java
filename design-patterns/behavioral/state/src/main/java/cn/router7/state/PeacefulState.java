package cn.router7.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Peaceful state.
 */
public class PeacefulState implements State {

    private static final Logger log = LoggerFactory.getLogger(PeacefulState.class);

    private final Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void observe() {
        log.info("{} is calm and peaceful.", mammoth);
    }

    @Override
    public void onEnterState() {
        log.info("{} calms down.", mammoth);
    }

}
