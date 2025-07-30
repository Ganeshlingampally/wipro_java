package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();  // Will throw InputMismatchException if input is not an integer
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Caught InputMismatchException: Please enter a valid integer.");
        }

        sc.nextLine(); // Clear the scanner buffer

        try {
            System.out.print("Enter a word: ");
            String word = sc.nextLine();
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();  // Index user wants to access in the string
            char ch = word.charAt(index);  // May throw StringIndexOutOfBoundsException
            System.out.println("Character at index " + index + " is: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Index out of bounds.");
        }

        sc.close();
    }
}

