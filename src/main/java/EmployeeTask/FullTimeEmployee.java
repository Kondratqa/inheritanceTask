package EmployeeTask;

public class FullTimeEmployee extends Employee {

    protected double monthlySalary;

    public FullTimeEmployee(String name,double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
