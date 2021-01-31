package com.training.assignment.controller;

import com.training.assignment.framework.Menu;
import com.training.assignment.service.EmployeeService;

/**
 * Controller only handles the incoming requests.
 */
public final class EmployeeController {

    private EmployeeService employeeService = new EmployeeService();
    // handle incoming employee related requests based on user choice

    public void createEmployee(final String name, final int age, final int salary) {

    }

    public void updateEmployee(String employeeId) {

    }

    public void deleteEmployee(String employeeId) {

    }

    public void listEmployee() {

    }

    public Menu showEmployeeMenu() {
        return employeeService.showMenu();
    }
}
