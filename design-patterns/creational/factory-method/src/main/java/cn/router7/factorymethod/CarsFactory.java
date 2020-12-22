package cn.router7.factorymethod;

public class CarsFactory {

    public static Car getCar(CarType type) {
        return type.getConstructor().get();
    }
}
