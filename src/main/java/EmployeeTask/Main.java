package EmployeeTask;

import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee myFullTimeEmployee = new FullTimeEmployee("John Doe", 20000.00);
        System.out.println(myFullTimeEmployee.calculateSalary());

        PartTimeEmployee myPartTimeEmployee = new  PartTimeEmployee("Arnold", 150, 160);
        System.out.println(myPartTimeEmployee.calculateSalary());

        Intern myIntern = new Intern("Joe Bayden", 10000);
        System.out.println(myIntern.calculateSalary());

        Contractor myContractor = new Contractor("Ben Aflek", 50000);
        System.out.println(myContractor.calculateSalary());

        Manager myManager = new Manager("Bill Clinton", 100000, 20000);
        System.out.println(myManager.calculateSalary());
    }
}
