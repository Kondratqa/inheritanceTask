package task;
//каждый человек умее получать зарплату (характерную для его профессии)
//у каждого человека есть пол
public abstract class Human {
    private boolean isMan;

    public Human(boolean isMan) {
        this.isMan = isMan;
    }

    public boolean isMan() {
        return isMan;
    }
    public abstract void getSalary();
}
