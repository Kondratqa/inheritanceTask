package VehiclesTask;

public class Main {
    public static void main(String[] args) {
        Vehicles myVehicles = new Vehicles("");
        myVehicles.start();

        Car myCar = new Car("Honda");
        myCar.start();

        Bike myBike = new Bike("Bugatty");
        myBike.start();

        Bus myBus = new Bus("Man");
        myBus.start();

        Truck myTruck = new Truck("Toyota");
        myTruck.start();

        Motorcycle myMotorcycle = new Motorcycle("BMW");

    }
}
