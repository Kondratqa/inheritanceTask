package houseAndSellerInheritanceTask;

public class Apartment extends LivingArea{


    public Apartment(String addres, double square, int numberOfRooms, double price, int yearBuilt) {
        super(addres, square, numberOfRooms, price, yearBuilt);
    }

    public Apartment() {
        super();
    }
}
