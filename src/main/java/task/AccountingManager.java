package task;

public class AccountingManager extends OfficeWorker{
    public AccountingManager(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Бухгалтер получил зарплату 50 тысяч рублей");

    }
}
