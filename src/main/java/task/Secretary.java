package task;

public class Secretary extends OfficeWorker{
    public Secretary(boolean isMan) {
        super(isMan);
    }
    @Override
    public void getSalary() {
        System.out.println("Секретарь получил зарплату 30 тысяч рублей");

    }
}
