//package houseAndSellerInheritanceTask;
///*Класс Sale:
//• Поля:
//• дом (LivingArea)
//• продавец (Seller)
//• сумма сделки (double)
//• дата сделки (String)
//• Методы:
//
//• Конструктор для инициализации всех полей.
//• Метод isSaleSuccessful(), который определяет, успешна ли сделка, если сумма сделки больше цены дома.*/
//public class Sale {
//    private LivingArea livingArea;
//    private Seller seller;
//    private double transactionAmount;
//    private String transactionDate;
//
//
//
//    public Sale(LivingArea livingArea, Seller seller, double transactionAmount, String transactionDate){
//        this.livingArea = livingArea;
//        this.seller = seller;
//        this.transactionAmount = transactionAmount;
//        this.transactionDate = transactionDate;
//    }
//
//    public LivingArea getHouse(){
//        return livingArea;
//    }
//    public void setHouse(LivingArea livingArea){
//        this.livingArea = livingArea;
//    }
//    public Seller getSeller(){
//        return seller;
//    }
//    public void setSeller(Seller seller){
//        this.seller = seller;
//    }
//    public double getTransactionAmount(){
//        return transactionAmount;
//    }
//    public void setTransactionAmount(double transactionAmount){
//        this.transactionAmount = transactionAmount;
//    }
//    public String getTransactionDate(){
//        return transactionDate;
//    }
//    public void setTransactionDate(String transactionDate){
//        this.transactionDate = transactionDate;
//    }
//
//    //Метод isSaleSuccessful(), который определяет, успешна ли сделка, если сумма сделки больше цены дома
//    public void isSaleSuccessful(double price){
//        if (transactionAmount > price ) {
//            System.out.println("Сделка не успешна - сумма сделки не может привышать стоимость дома");
//        }
//    }
//}
