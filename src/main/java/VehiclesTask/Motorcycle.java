package VehiclesTask;

public class Motorcycle extends Vehicles {
    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " Motorcycle is starting");
    }
}
