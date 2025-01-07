package VehiclesTask;

public class Car extends Vehicles {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " Моя машина запускается");
    }
}
