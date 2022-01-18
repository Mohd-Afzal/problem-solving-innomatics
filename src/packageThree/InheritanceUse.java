package packageThree;

public class InheritanceUse {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle("LMV");
        Car car = new Car("LMV", "Hyundai", "i20", 5);
        car.setAutomatic(true);
        car.setMileage(15);
        car.setFuelType("Diesel");

        car.display();

        // Polymorphism -> Dynamic Method Dispatching
        Vehicle car2 = new Car("LMV", "Hyundai", "i20", 5);


//        System.out.println(car.capacity); // Car
//        System.out.println(car.type); // Vehicle
//        System.out.println(car.fuelType); // Vehicle
//        System.out.println(car.isAutomatic); // Vehicle
//        System.out.println(car.modelName); // Car

    }
}
