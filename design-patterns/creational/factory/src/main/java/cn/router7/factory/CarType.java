package cn.router7.factory;

import java.util.function.Supplier;

public enum CarType {
    FORD(Ford::new), FERRARI(Ferrari::new);

    private final Supplier<Car> constructor;

    CarType(Supplier<Car> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Car> getConstructor() {
        return this.constructor;
    }
}
