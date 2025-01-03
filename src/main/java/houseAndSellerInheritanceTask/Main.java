package houseAndSellerInheritanceTask;

public class Main {
    public static void main(String[] args) {
        LivingArea myLivingArea = new LivingArea("Королёва 5", 300, 7, 500000, 2024);
//        myLivingArea.calculatePricePerSquareMeter();
//        System.out.println("Площадь дома " + myLivingArea.getSquare() + " кв метров," + " в доме " + myLivingArea.getNumberOfRooms() + " комнат," + " стоимость дома " + myLivingArea.getPrice() + " рублей, год постройки дома " + myLivingArea.getYearBuilt() + " года");
//
//        Seller mySeller = new Seller("Глеб", "Козлов", "+7(987-234-55-66)", 8, 4.5);
//        mySeller.isExperienced();
//        System.out.println("Продавец по имени " + mySeller.getName() + " " + mySeller.getSurname() + ", телефон продавца " + mySeller.getPhoneNumber() + " стаж продавца продавца " + mySeller.getYearsOfExperience() + " лет, " + " рейтинг продавца " + mySeller.getRating());
//
//        Sale mySale = new Sale(myLivingArea, mySeller , 600000, "24 мая");
//        mySale.isSaleSuccessful(myLivingArea.getPrice());
//        System.out.println("Cумма сделки " + mySale.getTransactionAmount() + " рублей, дата сделки " + mySale.getTransactionDate());
        Apartment myApartment = new Apartment();
        myLivingArea.calculatePricePerSquareMeter();

    }

}

