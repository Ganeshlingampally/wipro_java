package Assignment_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileWithBufferedReader {
    public static void main(String[] args) {
        String filePath = "Sample.txt"; 

        // Try-with-resources automatically closes the BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            System.out.println("Reading file content line by line:\n");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("The file was not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

