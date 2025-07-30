package Assignment;

import java.util.*;

public class RemoveDuplicatesAndSumEven {
    public static void main(String[] args) {
        // Input array
        int[] input = {2, 3, 54, 1, 6, 7, 7};

        // Use LinkedHashSet to maintain insertion order and remove duplicates
        Set<Integer> unique = new LinkedHashSet<>();
        for (int num : input) {
            unique.add(num);
        }

        // Display unique elements (optional)
        System.out.println("Unique elements: " + unique);

        // Sum of even numbers
        int sumEven = 0;
        for (int num : unique) {
            if (num % 2 == 0) {
                sumEven += num;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
    }
}

