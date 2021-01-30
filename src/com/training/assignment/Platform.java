package com.training.assignment;

import java.util.Scanner;

public class Platform {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Provide Employee details!");

        final String name = takeName();
        final int salary = takeSalary();
        final int age = takeAge();
        Employee employee = createEmployeeObject(name, salary, age);
        employee.displayInformation();
    }


    private static int identifier = 1;

    private static Employee createEmployeeObject(String name, int salary, int age) {
        return new Employee(name, salary, identifier++, age);
    }

    private static int takeAge() {
        System.out.println("Age:");
        return scanner.nextInt();
    }

    private static String takeName() {
        System.out.println("Name:");
        final String name = scanner.next();

        if (!isNameValid(name))
            return takeName();
        else
            return name;
    }

    private static boolean isNameValid(String name) {
        final boolean matches = name.matches("^[a-zA-Z]*$");
        if (!matches)
            System.out.println("Your name looks like invalid!Can you enter again!");

        return matches;
    }

    private static int takeSalary() {
        System.out.println("Salary:");
        return scanner.nextInt();
    }
}
