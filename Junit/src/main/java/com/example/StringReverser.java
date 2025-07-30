package com.example;

public class StringReverser {

    // Method to reverse a string
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }
}

