public class ElectroCar extends Vehicle {

    public ElectroCar(String brand, int model, int numberOfWeels, double maxSpeed) {
        super(brand, model, numberOfWeels, maxSpeed);
    }

    @Override
    public String toString() {
        return "ElectroCar is :  "+super.toString();
    }
}
