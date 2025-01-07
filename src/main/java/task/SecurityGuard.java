package task;

public class SecurityGuard extends  Human{
    public SecurityGuard(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Охранник получил 15 тысяч рублей");
    }
}
