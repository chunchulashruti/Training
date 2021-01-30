package com.training.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Platform {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Employee> employees = new ArrayList();
    private static int index = 0;

    public static void main(String[] args) {

        while (true) {
            int userChoice = askUsersChoice();
            processUserChoice(userChoice);
        }
    }

    private static void processUserChoice(int userChoice) {
        switch (userChoice) {
            case 1:
                final Employee employee = createEmployee();
                employees.add(employee);
                break;
            case 2:
                // TODO: Update employee flow
                System.out.println("Sorry ! update Employee is not yet supported!");
                break;
            case 3:
                System.out.println("Sorry ! Delete Employee is not yet supported!");
                // TODO: Delete employee flow
                break;
            case 4:
                for (Employee e : employees) {
                    e.displayInformation();
                }
                break;

        }
    }

    private static int askUsersChoice() {
        showUsersChoice();
        showAChoice("Choose your choice!");
        return scanner.nextInt();
    }

    private static void showUsersChoice() {
        showChoices("1. Create Employee", "2. Update Employee", "3. Delete Employee", "4. List Employees");
    }

    private static void showAChoice(String s) {
        System.out.println(s);
    }

    private static void showChoices(String... elements) {
        for (String element : elements) {
            showAChoice(element);
        }
    }


    private static Employee createEmployee() {
        showAChoice("Provide Employee details!");
        final String name = takeName();
        final int salary = takeSalary();
        final int age = takeAge();
        Employee employee = createEmployeeObject(name, salary, age);
        employee.displayInformation();

        return employee;
    }


    private static int identifier = 1;

    private static Employee createEmployeeObject(String name, int salary, int age) {
        return new Employee(name, salary, identifier++, age);
    }

    private static int takeAge() {
        showAChoice("Age:");
        return scanner.nextInt();
    }

    private static String takeName() {
        showAChoice("Name:");
        final String name = scanner.next();

        if (!isNameValid(name))
            return takeName();
        else
            return name;
    }

    private static boolean isNameValid(String name) {
        final boolean matches = name.matches("^[a-zA-Z]*$");
        if (!matches) {
            askForNameAgain();
        }

        return matches;
    }

    private static void askForNameAgain() {
        System.out.println("Your name looks like invalid!Can you enter again!");
    }

    private static int takeSalary() {
        showAChoice("Salary:");
        return scanner.nextInt();
    }
}
