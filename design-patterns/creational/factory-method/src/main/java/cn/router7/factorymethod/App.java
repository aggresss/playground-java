package cn.router7.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Factory is an object for creating other objects, it providing Providing a static method to
 * create and return objects of varying classes, in order to hide the implementation logic
 * and makes client code focus on usage rather then objects initialization and management.
 *
 * <p>In this example the CarFactory is the factory class and it provides a static method to
 * create different cars.
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
