package FactoryExercise;

public class Toyota extends Car{
    public Toyota () {
        maxSpeed=100;
        color="red";
        transmission="Automatic";
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
