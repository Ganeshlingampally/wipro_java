package Assignment;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceCounter {
    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 2, 5, 1, 2, 3, 5, 1};

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element : Occurrence");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println("   " + entry.getKey() + "    :    " + entry.getValue());
        }
    }
}

