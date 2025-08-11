package JUnit_Assignmet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    // Method to calculate factorial
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Test for valid factorial inputs
    @Test
    public void testFactorialValidInputs() {
        assertEquals(1, factorial(0));
        assertEquals(1, factorial(1));
        assertEquals(120, factorial(5));
        assertEquals(3628800, factorial(10));
    }

    // Test for negative input exception
    @Test
    public void testFactorialNegativeInputThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factorial(-3);
        });
        assertEquals("Number must be non-negative.", exception.getMessage());
    }
}

