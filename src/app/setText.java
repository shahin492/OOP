package app;

import java.util.Scanner;
import exceptions.InvalidAgeException;
import exceptions.InvalidDepartmentException;

public class Test {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }

    public static void validateDepartment(String dept) throws InvalidDepartmentException {
        if (!dept.equalsIgnoreCase("ICT")) {
            throw new InvalidDepartmentException("Only ICT department is allowed.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline

            validateAge(age);

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            validateDepartment(dept);

            System.out.println("Registration Successful");
            System.out.println("Age: " + age);
            System.out.println("Department: " + dept);

        } catch (InvalidAgeException | InvalidDepartmentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }

        sc.close();
    }
}