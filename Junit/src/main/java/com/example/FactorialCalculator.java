package com.example;

class FactorialCalculator {

    // Method to calculate factorial
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed.");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}



    /*
    ---------- Output ----------
    Factorial of 0: 1
    Factorial of 5: 120
    Factorial of 7: 5040
    Exception caught: Negative numbers are not allowed.
    ---------------------------
    */


