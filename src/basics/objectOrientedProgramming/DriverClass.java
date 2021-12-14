package basics.objectOrientedProgramming;


// Creating a blueprint of the object to be created
class Car {
    // Properties or class variables
    // Declaring and not initializing
    String brandName;
    String color;
    boolean isAutomatic;
    int numberOfSeats;
    int numberOfAirbags;

    // Define a constructor --> non-parameterised/default constructor
    Car() {}

    // Parameterised constructor
    Car(int numberOfAirbags) {
//        System.out.println("value of this is printed: " + this);
        this.numberOfAirbags = numberOfAirbags;
    }

    // Constructor Overloading
    Car(String brandName, int numberOfSeats) {
        this.brandName = brandName;
        this.numberOfSeats = 4;
    }

    Car (String brandName, String color, boolean isAutomatic, int numberOfSeats, int numberOfAirbags) {
        this.brandName = brandName;
        this.color = color;
        this.isAutomatic = isAutomatic;
        this.numberOfAirbags = numberOfAirbags;
        this.numberOfSeats = numberOfSeats;
    }

    // Functionalities
    // Without public static
    void dispaly() {
        System.out.println("Brand Name : " + this.brandName);
        System.out.println("Color : " + this.color);
        System.out.println("Automatic : " + this.isAutomatic);
        System.out.println("Number of seats : " + this.numberOfSeats);
        System.out.println("Number of Air Bags : " + this.numberOfAirbags);
    }
}

public class DriverClass {
    public static void main(String[] args) {
        // Creating an object of Car
//        Car obj = new Car(); // calling the non-parameterised/default constructor
//        Car obj = new Car(6); // calling the parameterised constructor

        // Hatchback category
        Car baleno = new Car("Maruti Suzuki", 5);
        Car swift = new Car("Maruti Suzuki", "White", true, 4, 2);
        Car nano = new Car("Tata", "Yellow", true, 4, 1);

        nano.brandName = "Tata Motors";
        nano.color = "White";

        baleno.dispaly();
        System.out.println();
        swift.dispaly();
        System.out.println();
        nano.dispaly();


        // Accessing the properties of an Object
//        System.out.println("Brand Name: " + obj.brandName);
//        System.out.println("Color of the Car: " + obj.color);
//        System.out.println("Is Automatic: " + obj.isAutomatic);
//        System.out.println("Number of seats: " + obj.numberOfSeats);
//        System.out.println("Number of Air Bags: " + obj.numberOfAirbags);

        // Accessing the methods of an Object
//        obj.drives();
    }
}
