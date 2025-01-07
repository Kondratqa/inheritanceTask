package EmployeeTask;

public class Contractor extends Employee {

    protected double contractAmount;

    public Contractor(String name, double contractAmount) {
        super(name);
        this.contractAmount = contractAmount;
    }

    public double getContractAmount() {
        return contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }
}
