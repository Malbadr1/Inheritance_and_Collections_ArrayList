public class Vehicle {
    private String brand;
    private int model;
    private int numberOfWeels;
    private double maxSpeed;

    public Vehicle(String brand, int model, int numberOfWeels, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.numberOfWeels = numberOfWeels;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getNumberOfWeels() {
        return numberOfWeels;
    }

    public void setNumberOfWeels(int numberOfWeels) {
        this.numberOfWeels = numberOfWeels;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model=" + model +
                ", numberOfWeels=" + numberOfWeels +
                ", maxSpeed=" + maxSpeed;
    }
}
