public class Bike extends Vehicle{
    public Bike(String brand, int model, int numberOfWeels, double maxSpeed) {
        super(brand, model, numberOfWeels, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bike is : " +super.toString();
    }
}
