package VehiclesTask;

public class Bus extends Vehicles {
    public Bus(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " Bus is starting");
    }
}
