package experiment3;

import experiment3.Developer;
import experiment3.Manager;
import experiment3.employee;

public class employee {
    int id;
    String name;
    double salary;

    employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    void calculateSalary(double bonus) {
        System.out.println("Total Salary with Bonus: " + (salary + bonus));
    }

    void calculateSalary(double bonus, double allowance) {
        System.out.println("Total Salary with Bonus & Allowance: " + (salary + bonus + allowance));
    }

    void work() {
        System.out.println("Employee works in the company");
    }
}

class Manager extends employee {
    String department;

    Manager(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }

    void work() {
        System.out.println("Manager manages the " + department + " department");
    }
}

class Developer extends employee {
    String language;

    Developer(int id, String name, double salary, String language) {
        super(id, name, salary);
        this.language = language;
    }

    void work() {
        System.out.println("Developer writes code in " + language);
    }
}

class EmployeeManagement {
    public static void main(String[] args) {

        Manager m = new Manager(101, "Yogesh", 80000, "HR");
        m.displayDetails();
        m.work();
        m.calculateSalary(5000);

        System.out.println();

        Developer d = new Developer(102, "Ashish", 70000, "Java");
        d.displayDetails();
        d.work();
        d.calculateSalary(5000, 3000);
    }
}