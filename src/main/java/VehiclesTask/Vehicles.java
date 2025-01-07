package VehiclesTask;

public class Vehicles {

    protected String brand;

    public Vehicles(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    public void start(){
        System.out.println("Мой автопарк");
    }
}
