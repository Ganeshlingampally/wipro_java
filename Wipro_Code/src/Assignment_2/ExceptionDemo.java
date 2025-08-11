package Assignment_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // 1️⃣ InputMismatchException demo
            System.out.print("Enter an integer: ");
            int number = sc.nextInt(); // Throws InputMismatchException if user enters a string
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Caught InputMismatchException: Please enter a valid integer.");
        }

        try {
            // 2️⃣ StringIndexOutOfBoundsException demo
            String text = "Java";
            System.out.println("Accessing character at index 10 in string: " + text);
            char ch = text.charAt(10); // This will throw StringIndexOutOfBoundsException
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Index is out of bounds for the string.");
        }
    }
}
