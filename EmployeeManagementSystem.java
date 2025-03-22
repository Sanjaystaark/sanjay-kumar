import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

// Main class

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(101, "SANJAY", 50000);
        Employee emp2 = new Employee(102, "JOHN", 55000);
        Employee emp3 = new Employee(103, "ELON MUSK", 60000);

        // Storing employees in a list
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        // Displaying employee details
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
