package PrototypeExercise;

import FactoryExercise.Car;

public class BMW extends Car {
    public BMW () {
        maxSpeed=110;
        color="White";
        transmission="Manual";
    }

    @Override
    public void showCar() {
        System.out.println("Max speed is: " +maxSpeed);
        System.out.println("Color: " + color);
        System.out.println("Transmission " + transmission);
    }
    @Override
    public void forward() {
        super.forward();
    }

    @Override
    public void backward() {
        super.backward();
    }
}

