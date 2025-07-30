package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringReverserTest {

    StringReverser reverser = new StringReverser();

    @Test
    public void testNullInput() {
        assertNull(reverser.reverse(null), "Should return null for null input");
    }

    @Test
    public void testEmptyString() {
        assertEquals("", reverser.reverse(""), "Should return empty string for empty input");
    }

    @Test
    public void testRegularString() {
        assertEquals("olleh", reverser.reverse("hello"), "Should return reversed string");
    }

    @Test
    public void testPalindromeString() {
        assertEquals("madam", reverser.reverse("madam"), "Should return same string for palindrome");
    }

    @Test
    public void testWhitespace() {
        assertEquals("  ", reverser.reverse("  "), "Should handle whitespaces properly");
    }
}

