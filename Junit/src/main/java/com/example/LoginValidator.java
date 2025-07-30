package com.example;

public class LoginValidator {

    // Hardcoded valid credentials (for demo purposes)
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";

    // Method to validate login
    public boolean validate(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }
        return username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD);
    }
}

