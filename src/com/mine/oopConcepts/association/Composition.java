package com.mine.oopConcepts.association;

public class Composition {
    public static void main(String[] args) {
        Car car = new Car();
    }
}
class Engine {
    private String type;
}
class Car {
    private final Engine engine;

    Car() {
        engine = new Engine();
    }
}
