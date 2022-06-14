package Main_Package;

import Adapter.*;
import Prototype.*;
import Iterator.*;
import Decorator.*;
import Builder.*;
import FactoryExercise.*;
public class Main {

    public static void main(String[] args) {
        Car car1 = new CarFactory().getCar("Toyota");
        car1.showCar();
        car1.forward();
//        MealBuilder mealBuilder = new MealBuilder();
//        Meal vegMeal = mealBuilder.prepareVegMeal();
//        System.out.println("Veg Meal");
//        vegMeal.showItems();
//        System.out.println("Total Cost: " + vegMeal.getCost());
//        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
//        System.out.println("\n\nNon-Veg Meal");
//        nonVegMeal.showItems();
//        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }

}


