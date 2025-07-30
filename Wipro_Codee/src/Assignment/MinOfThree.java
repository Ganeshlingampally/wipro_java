package Assignment;

import java.util.Scanner;

@FunctionalInterface
interface MinimumFinder {
    float minimum3(float a, float b, float c);
}

public class MinOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        System.out.print("Enter third number: ");
        float num3 = sc.nextFloat();

        // Lambda with method reference for Math.min
        MinimumFinder minFinder = (a, b, c) -> Math.min(Math.min(a, b), c);

        // Find minimum
        float result = minFinder.minimum3(num1, num2, num3);

        // Display result
        System.out.println("The smallest value is: " + result);

        sc.close();
    }
}

