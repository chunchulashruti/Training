package com.training.assignment.service;

import com.training.assignment.framework.Menu;
import com.training.assignment.framework.MenuItem;
import com.training.assignment.framework.MenuProvider;
import com.training.assignment.model.Employee;
import com.training.assignment.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService implements MenuProvider {

    private EmployeeRepository employeeRepository = new EmployeeRepository();

    public int createEmployee(String name, int age, int salary) {
        final int uniqueIdentifier = EmployeeIDGenerator.generateID();
        Employee employee = new Employee(name, salary, uniqueIdentifier, age);
        employeeRepository.save(employee);
        return uniqueIdentifier;
    }

    public void updateEmployee(int employeeId, String name, int age, int salary) {
        Employee employee = employeeRepository.retrieve(employeeId);
        employee.update(name, age, salary);
        employeeRepository.save(employee);
    }

    public void deleteEmployee(int employeeId) {
        employeeRepository.delete(employeeId);
    }

    public List<Employee> listEmployees() {
        // Fetch all employees from repository
        return employeeRepository.fetchAll();
    }

    @Override
    public Menu showMenu() {
        return new Menu("Employee", new MenuItem("Create Employee", 1),
                new MenuItem("Update Employee", 2),
                new MenuItem("Delete Employee", 3),
                new MenuItem("List Employee", 4));
    }
}
