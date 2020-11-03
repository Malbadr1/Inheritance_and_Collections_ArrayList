public class Car extends Vehicle{


    public Car(String brand, int model, int numberOfWeels, double maxSpeed) {
        super(brand, model, numberOfWeels, maxSpeed);
    }

    @Override
    public String toString() {
        return "Car is : "+super.toString();
    }

}
