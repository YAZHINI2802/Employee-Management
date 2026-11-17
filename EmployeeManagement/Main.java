package EmployeeManagement;



public class Main {

    public static void main(String[] args) {

        Department dept1 = new Department();

        dept1.departmentId = 101;
        dept1.departmentName = "IT";

      
        Department dept2 = new Department();

        dept2.departmentId = 102;
        dept2.departmentName = "HR";

      
        Employee emp1 = new Employee();

        emp1.employeeId = 1;
        emp1.employeeName = "Arun";
        emp1.salary = 30000;
        emp1.designation = "Java Developer";

        
        Employee emp2 = new Employee();

        emp2.employeeId = 2;
        emp2.employeeName = "Priya";
        emp2.salary = 40000;
        emp2.designation = "HR Executive";

        System.out.println("DEPARTMENT DETAILS");

        dept1.displayDepartment();
        System.out.println();

        dept2.displayDepartment();
        System.out.println();

        
        System.out.println(" EMPLOYEE DETAILS");

        emp1.displayDetails();
        System.out.println();

        emp2.displayDetails();
    }
}
