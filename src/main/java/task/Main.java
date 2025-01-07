package task;

public class Main {
    public static void main(String[] args) {
        SecurityGuard mySecurityGuard = new SecurityGuard(true);
        Secretary mySecretary = new Secretary(false);
        AccountingManager myAccountingManager = new AccountingManager(false);


        mySecurityGuard.getSalary();
        mySecretary.getSalary();
        mySecretary.drinkCoffee();
        myAccountingManager.getSalary();
    }
}
