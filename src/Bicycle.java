public class Bicycle extends Vehicle{
    public Bicycle(String brand, int model, int numberOfWeels, double maxSpeed) {
        super(brand, model, numberOfWeels, maxSpeed);
    }


    @Override
    public String toString() {
        return "Bicycle is : "+super.toString();
    }
}
