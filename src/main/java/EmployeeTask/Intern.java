package EmployeeTask;

public class Intern extends Employee {

    protected double stipend;

    public Intern(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    public double getStipend() {
        return stipend;
    }

    @Override
    public double calculateSalary() {
        return stipend;
    }
}
