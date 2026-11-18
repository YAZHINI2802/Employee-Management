
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        try {

            while (true) {

                System.out.println("\n EMPLOYEE MANAGEMENT SYSTEM ");
                System.out.println("1. Add Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Search Employee");
                System.out.println("4. Update Employee");
                System.out.println("5. Delete Employee");
                System.out.println("6. Exit");

                try {

                    System.out.print("Enter your choice: ");
                    int choice = Integer.parseInt(scanner.nextLine());

                    switch (choice) {

                        case 1:
                            System.out.print("Enter Employee ID: ");
                            int id = Integer.parseInt(scanner.nextLine());

                            System.out.print("Enter Employee Name: ");
                            String name = scanner.nextLine();

                            System.out.print("Enter Salary: ");
                            double salary = Double.parseDouble(scanner.nextLine());

                            Employee employee = new Employee(id, name, salary);
                            service.addEmployee(employee);
                            break;

                        case 2:
                            service.viewEmployees();
                            break;

                        case 3:
                            System.out.print("Enter Employee ID: ");
                            int searchId = Integer.parseInt(scanner.nextLine());

                            System.out.println(service.searchEmployee(searchId));
                            break;

                        case 4:
                            System.out.print("Enter Employee ID: ");
                            int updateId = Integer.parseInt(scanner.nextLine());

                            System.out.print("Enter New Name: ");
                            String newName = scanner.nextLine();

                            System.out.print("Enter New Salary: ");
                            double newSalary = Double.parseDouble(scanner.nextLine());

                            service.updateEmployee(updateId, newName, newSalary);
                            break;

                        case 5:
                            System.out.print("Enter Employee ID: ");
                            int deleteId = Integer.parseInt(scanner.nextLine());

                            service.deleteEmployee(deleteId);
                            break;

                        case 6:
                            System.out.println("Thank you!");
                            return;

                        default:
                            System.out.println("Invalid choice!");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Please enter valid numbers!");

                } catch (EmployeeNotFoundException | IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());

                } finally {
                    System.out.println("Operation completed.");
                }
            }

        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }
}
