package cn.router7.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        var car1 = CarsFactory.getCar(CarType.FORD);
        var car2 = CarsFactory.getCar(CarType.FERRARI);
        log.info(car1.getDescription());
        log.info(car2.getDescription());
    }
}
