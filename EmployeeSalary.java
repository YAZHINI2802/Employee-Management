import java.util.*;
public class EmployeeSalary {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the employee ID: ");
    int EmployeeId = scanner.nextInt();

    scanner.nextLine(); 

    System.out.println("Enter the Name: ");
    String employeeName = scanner.nextLine();

    System.out.print("Enter the basic Salary: ");
    double basicSalary = scanner.nextDouble();

    double hra= basicSalary*0.20;
    double da= basicSalary*0.10;
    double pf = basicSalary*0.12;

    double grossSalary = basicSalary + hra + da;
    double netSalary = basicSalary - pf;

    System.out.println("Employee ID: " +  EmployeeId);
    System.out.println("Employee Name: " +   employeeName);
    System.out.println("Employee grossSalary: " +  grossSalary);
    System.out.println("Employee pf: " +  pf);
    System.out.println("Employee Net Salary: " + netSalary);
    scanner.close();
}
}