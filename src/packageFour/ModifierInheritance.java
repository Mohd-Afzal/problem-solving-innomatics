package packageFour;

import packageThree.Car;
import packageThree.Vehicle;

class Truck extends Vehicle {

    public Truck() {
        super("LMV");
    }

    // Accessible?
    public void print() {
        this.fuelType = "Petrol";
        this.display(); // Accessible in subclass using this object

        this.isAutomatic();
//        this.isAutomatic = true; // NOt accessible in subclass even using this object

        Vehicle veh = new Vehicle("LMV");
//        veh.display(); // This is not accessible using Vehicle's object as visibility is zero
//        this.isAutomatic = true; // This is not accessible using veh obj
    }
}

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
