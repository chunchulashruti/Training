package com.training.assignment.service;

import com.training.assignment.framework.Menu;
import com.training.assignment.framework.MenuItem;
import com.training.assignment.framework.MenuProvider;

public class EmployeeService implements MenuProvider {

    public void createEmployee() {

    }

    public void updateEmployee(String employeeId) {

    }

    public void deleteEmployee(String employeeId) {

    }

    public void listEmployee() {

    }

    @Override
    public Menu showMenu() {
        return new Menu("Employee", new MenuItem("Create Employee", 1),
                new MenuItem("Update Employee", 2),
                new MenuItem("Delete Employee", 3),
                new MenuItem("List Employee", 4));
    }
}
