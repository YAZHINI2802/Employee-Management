import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {

    private List<Employee> employees;

    public EmployeeService(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> filterByDepartment(String department) {

        return employees.stream()
                .filter(employee -> employee.getDepartment().equalsIgnoreCase(department))
                .collect(Collectors.toList());
    }

    
    public List<Employee> filterBySalary(double salary) {

        return employees.stream()
                .filter(employee -> employee.getSalary() >= salary)
                .collect(Collectors.toList());
    }


    public List<Employee> filterByDepartmentAndSalary(
            String department, double salary) {

        return employees.stream()
                .filter(employee -> employee.getDepartment().equalsIgnoreCase(department))
                .filter(employee -> employee.getSalary() >= salary)
                .collect(Collectors.toList());
    }

  
    public Optional<Employee> findEmployeeById(int id) {

        return employees.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst();
    }

    public void displayEmployees(List<Employee> employees) {

        employees.forEach(System.out::println);
    }
}