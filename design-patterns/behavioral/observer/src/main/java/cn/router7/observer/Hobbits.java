package cn.router7.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hobbits.
 */
public class Hobbits implements WeatherObserver {

    private static final Logger log = LoggerFactory.getLogger(Hobbits.class);

    @Override
    public void update(WeatherType currentWeather) {
        log.info("The hobbits are facing " + currentWeather.getDescription() + " weather now");
    }
}