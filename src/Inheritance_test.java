public class Inheritance_test {
    public static void main(String[] args) {


        Car car=new Car("mercedes",2020,4,200);
        System.out.println(car);

        ElectroCar electroCar=new ElectroCar("tesla",2020,4,180);
        System.out.println(electroCar);

        Bike bike = new Bike("Honda", 2020, 2, 220);
        System.out.println(bike);

        Bicycle bicycle=new Bicycle("BMC", 2020, 2, 20);
        System.out.println(bicycle);



    }
}