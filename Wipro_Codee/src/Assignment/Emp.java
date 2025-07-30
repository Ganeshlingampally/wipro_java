package Assignment;

//Custom Exception
class LowSalException extends Exception {
 public LowSalException(String message) {
     super(message);
 }
}

//Main Emp Class
public class Emp {

 private int empId;
 private String empName;
 private String designation;
 private double basic;
 private final double hra;

 // Constructor
 public Emp(int empId, String empName, String designation, double basic) throws LowSalException {
     this.empId = empId;
     this.empName = empName;
     this.designation = designation;
     if (basic < 50000) {
         throw new LowSalException("Salary is too low. It must be at least 50000.");
     }
     this.basic = basic;
     this.hra = calculateHRA();
 }

 // HRA Calculation Method
 private double calculateHRA() {
     switch (designation.toLowerCase()) {
         case "manager":
             return 0.10 * basic;
         case "teamleader":
             return 0.12 * basic;
         case "hr":
             return 0.05 * basic;
         default:
             return 0.0;
     }
 }

 // Method to display employee details
 public void printDET() {
     System.out.println("---- EMPLOYEE DETAILS ----");
     System.out.println("ID          : " + empId);
     System.out.println("Name        : " + empName);
     System.out.println("Designation : " + designation);
     System.out.println("Basic       : " + basic);
     System.out.println("HRA         : " + hra);
     System.out.println();
 }

 // Main Method to Test
 public static void main(String[] args) {
     try {
         Emp e1 = new Emp(101, "John", "Manager", 60000);
         e1.printDET();

         Emp e2 = new Emp(102, "Ravi", "TeamLeader", 70000);
         e2.printDET();

         Emp e3 = new Emp(103, "Priya", "HR", 45000);  // This will throw exception

     } catch (LowSalException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}


//---- EMPLOYEE DETAILS ----
//ID          : 101
//Name        : John
//Designation : Manager
//Basic       : 60000.0
//HRA         : 6000.0
//
//---- EMPLOYEE DETAILS ----
//ID          : 102
//Name        : Ravi
//Designation : TeamLeader
//Basic       : 70000.0
//HRA         : 8400.0
//
//Exception: Salary is too low. It must be at least 50000.
