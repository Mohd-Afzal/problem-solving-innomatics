package packageFour;

import dataStructures.HashMapUse;
import packageThree.Car;
import packageThree.Vehicle;

public class ModifierInheritance {
    public static void main(String[] args) {
        Car car = new Car("LMV", "Hyundai", "i20", 5);
        car.setAutomatic(true);
        car.setMileage(15);
        car.setFuelType("Diesel");

        car.display();

//        System.out.println(car.capacity); // Car
//        System.out.println(car.type); // Vehicle
//        System.out.println(car.fuelType); // Vehicle
//        System.out.println(car.isAutomatic); // Vehicle
//        System.out.println(car.modelName); // Car
    }
}
