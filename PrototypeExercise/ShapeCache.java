package PrototypeExercise;

import java.util.Hashtable;
import PrototypeExercise.Car;
public class ShapeCache {
    public static Hashtable <String , Car> carShape = new Hashtable<String, Car>();
    public static Car getCar(String carID)
    {
        Car car = carShape.get(carID);
        return (Car) car.clone();
    }
    public static void loadCache() {
        Car c1 = new Toyota();
        carShape.put(c1.getCarID() , c1);
    }

}
