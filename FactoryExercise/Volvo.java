package FactoryExercise;

public class Volvo extends Car{
    public Volvo () {
        maxSpeed=150;
        color="Green";
        transmission="Manual Or Automatic";
    }

    @Override
    public void showCar() {
        System.out.println("Max speed is: " + maxSpeed);
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
