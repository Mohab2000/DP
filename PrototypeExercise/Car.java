package PrototypeExercise;

public abstract class Car implements Cloneable{
    public float maxSpeed;
    public String color;
    public String transmission;
    public String carID;

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public abstract void showCar();
    public void forward() {
        System.out.println("Moving forwarrrrrrrrrrrrrrrrrd");
    };
    public void backward() {
        System.out.println("Moving backwaaaaaaaaaaaaaaaaard");
    }
    public Object clone () {
        Object clone = null;
        try {
            clone=super.clone();
        }
        catch (Exception exp ){
            System.out.println("Exception");
        }
        return clone;
    }

}
