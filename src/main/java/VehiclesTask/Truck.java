package VehiclesTask;

public class Truck extends Vehicles {
    public Truck(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " Truck start");
    }
}
