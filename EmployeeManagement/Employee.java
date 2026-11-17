package EmployeeManagement;

public class Employee {

    int employeeId;
    String employeeName;
    double salary;
    String designation;

    void displayDetails() {

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Designation: " + designation);
    }
}