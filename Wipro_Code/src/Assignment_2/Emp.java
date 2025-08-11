package Assignment_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Emp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1️⃣ InputMismatchException demo
        try {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();  // can throw InputMismatchException
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Caught InputMismatchException: Please enter a valid integer.");
        }

        // 2️⃣ StringIndexOutOfBoundsException demo (Safe Version)
        try {
            String str = "Java";
            System.out.println("String is: " + str);
            System.out.print("Enter a valid index (0 to " + (str.length() - 1) + "): ");
            int index = sc.nextInt();

            if (index >= 0 && index < str.length()) {
                char ch = str.charAt(index);
                System.out.println("Character at index " + index + ": " + ch);
            } else {
                System.out.println("Invalid index! Please enter between 0 and " + (str.length() - 1));
            }

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Index is out of bounds for the string.");
        } catch (InputMismatchException e) {
            System.out.println("Caught InputMismatchException: Please enter a valid number for index.");
        }

        System.out.println("Program ended safely.");
    }
}


