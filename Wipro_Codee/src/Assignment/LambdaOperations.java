package Assignment;

public class LambdaOperations {

    // Functional Interface
    interface PerformOperation {
        boolean check(int a);
    }

    // Method to return lambda: isOdd
    public static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    // Method to return lambda: isPrime
    public static PerformOperation isPrime() {
        return n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
    }

    // Method to return lambda: isPalindrome
    public static PerformOperation isPalindrome() {
        return n -> {
            int original = n;
            int reversed = 0;
            while (n != 0) {
                int digit = n % 10;
                reversed = reversed * 10 + digit;
                n /= 10;
            }
            return original == reversed;
        };
    }

    // Test the methods
    public static void main(String[] args) {
        PerformOperation opOdd = isOdd();
        PerformOperation opPrime = isPrime();
        PerformOperation opPalindrome = isPalindrome();

        int number = 121;

        System.out.println("Number: " + number);
        System.out.println("Is Odd? " + opOdd.check(number));            // true
        System.out.println("Is Prime? " + opPrime.check(number));        // false
        System.out.println("Is Palindrome? " + opPalindrome.check(number)); // true
    }
}

