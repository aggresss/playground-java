package cn.router7.observer.generic;

import cn.router7.observer.WeatherType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * GOrcs.
 */
public class GOrcs implements Race {

    private static final Logger log = LoggerFactory.getLogger(GOrcs.class);

    @Override
    public void update(GWeather weather, WeatherType weatherType) {
        log.info("The orcs are facing " + weatherType.getDescription() + " weather now");
    }
}
