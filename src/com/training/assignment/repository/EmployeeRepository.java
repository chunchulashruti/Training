package com.training.assignment.repository;

import com.training.assignment.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRepository {

    private static Map<Integer, Employee> employeesData = new HashMap<>();

    public List<Employee> fetchAll() {
        return new ArrayList<>(employeesData.values());
    }

    public void save(Employee employee) {
        employeesData.put(employee.getUniqueIdentifier(), employee);
    }

    public Employee retrieve(final int key) {
        return employeesData.get(key);
    }

    public boolean delete(int employeeId) {
        if (employeesData.containsKey(employeeId)) {
            employeesData.remove(employeeId);
            return true;
        }
        return false;
    }
}
