package packageThree;

public class Car extends Vehicle {
    public String brandName;
    public String modelName;
    public int capacity;

    public Car(String type, String brandName, String modelName, int capacity) {
        // Invoke the parent constructor
        super(type); // calling the constructor of Vehiclle class with one parameter

        this.brandName = brandName;
        this.modelName = modelName;
        this.capacity = capacity;
    }

//    display() {} -> that belongs to Vehicle -> hidden
//    This conflict of having functions with the same name inherited from the base class -> function overriding
    public void display() {
        System.out.println("brandName: " + this.brandName);
        System.out.println("modelName: " + this.modelName);
        System.out.println("capacity: " + this.capacity);
        super.display();
    }


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
