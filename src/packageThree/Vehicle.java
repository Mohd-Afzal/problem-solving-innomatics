package packageThree;

public class Vehicle {
    protected boolean isAutomatic;
    protected String fuelType;
    protected int mileage;
    protected String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public void display() {
        System.out.println("isAutomatic: " + this.isAutomatic);
        System.out.println("fuelType: " + this.fuelType);
        System.out.println("mileage: " + this.mileage);
        System.out.println("type: " + this.type);
    }



    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
