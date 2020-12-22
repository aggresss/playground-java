package cn.router7.factory;

public class CarsFactory {

    public static Car getCar(CarType type) {
        return type.getConstructor().get();
    }
}
