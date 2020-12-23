package cn.router7.observer.generic;

import cn.router7.observer.WeatherType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * GWeather.
 */
public class GWeather extends Observable<GWeather, Race, WeatherType> {

    private static final Logger LOGGER = LoggerFactory.getLogger(GWeather.class);

    private WeatherType currentWeather;

    public GWeather() {
        currentWeather = WeatherType.SUNNY;
    }

    /**
     * Makes time pass for weather.
     */
    public void timePasses() {
        var enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        LOGGER.info("The weather changed to {}.", currentWeather);
        notifyObservers(currentWeather);
    }
}