package FactoryExercise;

public abstract class Car {
    public float maxSpeed;
    public String color;
    public String transmission;

    public abstract void showCar();
    public void forward() {
        System.out.println("Moving forwarrrrrrrrrrrrrrrrrd");
    };
    public void backward() {
        System.out.println("Moving backwaaaaaaaaaaaaaaaaard");
    }
}
