import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        // Create employee records
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Arun", "IT", 45000));
        employees.add(new Employee(102, "Priya", "HR", 30000));
        employees.add(new Employee(103, "Rahul", "IT", 60000));
        employees.add(new Employee(104, "Divya", "Finance", 35000));
        employees.add(new Employee(105, "Karthik", "IT", 25000));
        employees.add(new Employee(106, "Meena", "HR", 50000));

        EmployeeService service = new EmployeeService(employees);

   
        System.out.println("\n Lambda Expression");

        employees.forEach(employee -> System.out.println(employee.getName()));

        
        System.out.println("\n Functional Interface ---");

        Predicate<Employee> highSalary = employee -> employee.getSalary() >= 40000;

        employees.stream()
                .filter(highSalary)
                .forEach(System.out::println);

    
        System.out.println("\n IT Department Employees ");

        List<Employee> itEmployees = service.filterByDepartment("IT");

        service.displayEmployees(itEmployees);

        
        System.out.println("\nEmpl oyees with Salary >= 40000 ");

        List<Employee> highSalaryEmployees = service.filterBySalary(40000);

        service.displayEmployees(highSalaryEmployees);




   
        System.out.println("\n IT Employees with Salary >= 40000 ");

        List<Employee> filteredEmployees =
                service.filterByDepartmentAndSalary("IT", 40000);

        service.displayEmployees(filteredEmployees);



     
        System.out.println("\n Find Employee by ID ---");

        Optional<Employee> employee = service.findEmployeeById(103);

        employee.ifPresent(System.out::println);

        
        System.out.println("\n--- Method Reference ---");

        employees.forEach(System.out::println);
    }
}