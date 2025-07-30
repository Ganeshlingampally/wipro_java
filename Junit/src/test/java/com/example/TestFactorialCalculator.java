package com.example;

public class TestFactorialCalculator {
    public static void main(String[] args) {
        FactorialCalculator calc = new FactorialCalculator();

        // Test valid inputs
        System.out.println("Factorial of 0: " + calc.factorial(0)); // 1
        System.out.println("Factorial of 5: " + calc.factorial(5)); // 120
        System.out.println("Factorial of 7: " + calc.factorial(7)); // 5040

        // Test invalid input
        try {
            System.out.println("Factorial of -3: " + calc.factorial(-3));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
