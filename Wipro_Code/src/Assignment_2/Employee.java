package Assignment_2;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String name;
    private int yearOfBirth;

    public Employee(String employeeId, String name, int yearOfBirth) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public void displayDetails() {
        System.out.println("Employee Name       : " + name);
        System.out.println("Year of Birth       : " + yearOfBirth);
        System.out.println("Employee ID         : " + employeeId);

        String[] parts = employeeId.split("-");

        if (parts.length == 3) {
            String yearCode = parts[0];
            String designationCode = parts[1];
            String numberCode = parts[2];

            System.out.println("Parsed Year Code    : " + yearCode);
            System.out.print("Parsed Designation  : ");
            if (designationCode.equalsIgnoreCase("F")) {
                System.out.println("Faculty");
            } else if (designationCode.equalsIgnoreCase("S")) {
                System.out.println("Staff");
            } else {
                System.out.println("Unknown");
            }
            System.out.println("Parsed Number Code  : " + numberCode);
        } else {
            System.out.println("Invalid Employee ID format.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID (format: YY-F/S-###): ");
        String empId = sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Year of Birth: ");
        int birthYear = sc.nextInt();

        Employee emp = new Employee(empId, empName, birthYear);

        System.out.println("\n--- Employee Details ---");
        emp.displayDetails();
    }
}

