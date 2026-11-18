

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    private Map<Integer, Employee> employeeMap = new HashMap<>();

    private Set<Integer> employeeIds = new HashSet<>();

    // Add Employee
    public void addEmployee(Employee employee) {

        int id = employee.getEmployeeId();

        if (employeeIds.contains(id)) {
            throw new IllegalArgumentException("Employee ID already exists!");
        }

        employees.add(employee);
        employeeMap.put(id, employee);
        employeeIds.add(id);

        System.out.println("Employee added successfully!");
    }

    // View All Employees
    public void viewEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No employee records found.");
            return;
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Search Employee
    public Employee searchEmployee(int id)
            throws EmployeeNotFoundException {

        Employee employee = employeeMap.get(id);

        if (employee == null) {
            throw new EmployeeNotFoundException(
                    "Employee not found with ID: " + id);
        }

        return employee;
    }

    // Update Employee
    public void updateEmployee(int id, String name, double salary)
            throws EmployeeNotFoundException {

        Employee employee = searchEmployee(id);

        employee.setEmployeeName(name);
        employee.setSalary(salary);

        System.out.println("Employee updated successfully!");
    }

    // Delete Employee
    public void deleteEmployee(int id)
            throws EmployeeNotFoundException {

        Employee employee = searchEmployee(id);

        employees.remove(employee);
        employeeMap.remove(id);
        employeeIds.remove(id);

        System.out.println("Employee deleted successfully!");
    }
}
