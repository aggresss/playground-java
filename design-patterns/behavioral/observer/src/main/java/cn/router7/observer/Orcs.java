package cn.router7.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Orcs.
 */
public class Orcs implements WeatherObserver {

    private static final Logger log = LoggerFactory.getLogger(Orcs.class);

    @Override
    public void update(WeatherType currentWeather) {
        log.info("The orcs are facing " + currentWeather.getDescription() + " weather now");
    }
}
