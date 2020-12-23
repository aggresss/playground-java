package cn.router7.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Angry state.
 */
public class AngryState implements State {

  private static final Logger log = LoggerFactory.getLogger(AngryState.class);

  private final Mammoth mammoth;

  public AngryState(Mammoth mammoth) {
    this.mammoth = mammoth;
  }

  @Override
  public void observe() {
    log.info("{} is furious!", mammoth);
  }

  @Override
  public void onEnterState() {
    log.info("{} gets angry!", mammoth);
  }

}
