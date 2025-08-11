package Assignment_2;

import java.util.Scanner;

//Custom Exception Class
class InvalidEmployeeCode extends Exception {
 public InvalidEmployeeCode(String message) {
     super(message);
 }
}

//Employee Class
public class Em {
 private String empCode;
 private String empName;
 private int empAge;

 // Constructor
 public Em(String empCode, String empName, int empAge) {
     this.empCode = empCode;
     this.empName = empName;
     this.empAge = empAge;
 }

 // Method to display employee details
 public void display() {
     System.out.println("\n--- Employee Details ---");
     System.out.println("Employee Code: " + empCode);
     System.out.println("Employee Name: " + empName);
     System.out.println("Employee Age : " + empAge);
 }

 // Main method
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         // Input
         System.out.print("Enter Employee Code (Format: EMP123): ");
         String code = sc.nextLine();

         // Validate employee code (must start with "EMP" followed by 3 digits)
         if (!code.matches("EMP\\d{3}")) {
             throw new InvalidEmployeeCode("Invalid Employee Code! Must be in format EMP followed by 3 digits.");
         }

         // If valid, continue reading other details
         System.out.print("Enter Employee Name: ");
         String name = sc.nextLine();

         System.out.print("Enter Employee Age: ");
         int age = sc.nextInt();

         // Create Employee object and display
         Em emp = new Em(code, name, age);
         emp.display();

     } catch (InvalidEmployeeCode e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception ex) {
         System.out.println("Unexpected Error: " + ex.getMessage());
     }
 }
}

