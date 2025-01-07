package EmployeeTask;

public class Manager extends Employee {

    protected double basicSalary;
    protected double bonus;

    public Manager(String name, double basicSalary, double bonus) {
        super(name);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }
}
