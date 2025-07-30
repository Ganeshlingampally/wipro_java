package Assignment;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentValidation {

    public static void main(String[] args) throws NumberFormatException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Register Number: ");
        String regNo = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobNo = sc.nextLine();

        try {
            // Check length
            if (regNo.length() != 9 || mobNo.length() != 10) {
                throw new IllegalArgumentException("Invalid length");
            }

            // Check mobile number digits only
            if (!mobNo.matches("\\d+")) {
                throw new NumberFormatException("Mobile number contains non-digit characters");
            }

            // Check register number is alphanumeric
            if (!regNo.matches("[a-zA-Z0-9]+")) {
                throw new NoSuchElementException("Register number contains special characters");
            }

            System.out.println("valid");

        } catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println("invalid");
            System.out.println("Reason: " + e.getMessage());
        }

        sc.close();
    }
}
