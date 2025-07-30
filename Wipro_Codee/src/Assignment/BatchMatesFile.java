package Assignment;

import java.io.*;
import java.util.*;

public class BatchMatesFile {
    public static void main(String[] args) {
        String fileName = "batchmates.txt";
        List<String> names = Arrays.asList(
            "Anjali",
            "Rahul",
            "Sneha",
            "Vikram",
            "Neha",
            "Kiran",
            "Sameer"
        );

        // Write names to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
            System.out.println("Batchmates list written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read and display names from the file
        System.out.println("\n--- Batchmates List ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
//Batchmates list written to batchmates.txt
//
//--- Batchmates List ---
//Anjali
//Rahul
//Sneha
//Vikram
//Neha
//Kiran
//Sameer

