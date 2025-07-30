package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginValidatorTest {

    private LoginValidator validator;

    @BeforeEach
    public void setUp() {
        validator = new LoginValidator();
    }

    @Test
    public void testValidCredentials() {
        assertTrue(validator.validate("admin", "password123"), "Valid credentials should pass");
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(validator.validate("user", "password123"), "Invalid username should fail");
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(validator.validate("admin", "wrongpass"), "Invalid password should fail");
    }

    @Test
    public void testEmptyUsername() {
        assertFalse(validator.validate("", "password123"), "Empty username should fail");
    }

    @Test
    public void testEmptyPassword() {
        assertFalse(validator.validate("admin", ""), "Empty password should fail");
    }

    @Test
    public void testNullUsername() {
        assertFalse(validator.validate(null, "password123"), "Null username should fail");
    }

    @Test
    public void testNullPassword() {
        assertFalse(validator.validate("admin", null), "Null password should fail");
    }

    @Test
    public void testBothNull() {
        assertFalse(validator.validate(null, null), "Both null should fail");
    }
}

