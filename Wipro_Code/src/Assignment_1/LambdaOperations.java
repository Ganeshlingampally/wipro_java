package Assignment_1;

interface PerformOperation {
    boolean check(int a);
}

public class LambdaOperations {

    public static PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return (int a) -> {
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return (int a) -> {
            int original = a, reversed = 0;
            while (a != 0) {
                int digit = a % 10;
                reversed = reversed * 10 + digit;
                a /= 10;
            }
            return original == reversed;
        };
    }

    public static void main(String[] args) {
        PerformOperation oddOp = isOdd();
        PerformOperation primeOp = isPrime();
        PerformOperation palindromeOp = isPalindrome();

        int testNum1 = 11;
        int testNum2 = 22;
        int testNum3 = 121;

        System.out.println(testNum1 + " is odd? " + oddOp.check(testNum1));
        System.out.println(testNum1 + " is prime? " + primeOp.check(testNum1));
        System.out.println(testNum3 + " is palindrome? " + palindromeOp.check(testNum3));

        System.out.println(testNum2 + " is odd? " + oddOp.check(testNum2));
        System.out.println(testNum2 + " is prime? " + primeOp.check(testNum2));
        System.out.println(testNum2 + " is palindrome? " + palindromeOp.check(testNum2));
    }
}
