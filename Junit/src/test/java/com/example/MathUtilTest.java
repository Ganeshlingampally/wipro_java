package com.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilTest {

    @Test
    void testDivideByNonZero() {
        assertEquals(2, MathUtil.divide(10, 5));
    }

    @Test
    void testDivideByZeroThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MathUtil.divide(10, 0);
        });

        assertEquals("Divisor cannot be zero", exception.getMessage());
    }
}

