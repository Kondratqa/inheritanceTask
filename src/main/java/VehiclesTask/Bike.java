package VehiclesTask;

public class Bike extends Vehicles {
    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " Мой мотоцикл стартует");
    }
}
