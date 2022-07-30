package com.company.module10;

public class InterfaceActivityClass {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();
        bike.start();
        car.start();
        bike.stop();
        car.stop();
    }
}
