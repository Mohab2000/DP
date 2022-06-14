package FactoryExercise;

public class CarFactory {
    public Car getCar(String carType) {
        if(carType==null)
            return null;
        else if(carType.equalsIgnoreCase("Toyota"))
            return new Toyota();
        else if(carType.equalsIgnoreCase("Volvo"))
            return new Volvo();
        else if(carType.equalsIgnoreCase("BMW"))
            return new BMW();
        return null;
    }
}
