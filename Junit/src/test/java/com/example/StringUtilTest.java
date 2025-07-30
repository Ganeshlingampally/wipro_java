package com.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    @Test
    void testReverseRegularString() {
        assertEquals("tac", StringUtil.reverse("cat"));
    }

    @Test
    void testReverseEmptyString() {
        assertEquals("", StringUtil.reverse(""));
    }

    @Test
    void testReverseNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.reverse(null);
        });
        assertEquals("Input cannot be null", exception.getMessage());
    }
}

