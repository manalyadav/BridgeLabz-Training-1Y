package EmployeeManagementSystem;
import java.util.ArrayList;
import java.util.Scanner;
public class Runner {
public static void main(String[] args) {
    // Polymorphism: Employee reference, but Subclass objects
    ArrayList<Employee> list = new ArrayList<>();
    FullTimeEmployee ft = new FullTimeEmployee(101, "Saksham Shukla", 50000, 5000);
    ft.assignDepartment("IT");

    PartTimeEmployee pt = new PartTimeEmployee(102, "Simran", 500, 80);
    pt.assignDepartment("Sales");

    list.add(ft);
    list.add(pt);

    for (int i = 0; i < list.size(); i++) {
        // List se current index wala employee nikalna
        Employee e = list.get(i);

        e.calculateSalary(); // Dynamic Method Dispatch
        e.displayDetails();

        // Checking if employee has Department capability
        if (e instanceof Department) {
            // Typecasting karke department details nikalna
            System.out.println(((Department) e).getDepartmentDetails());
        }
    }
        System.out.println("-----------------------------");
    }
}
