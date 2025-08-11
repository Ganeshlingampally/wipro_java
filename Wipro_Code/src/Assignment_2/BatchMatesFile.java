package Assignment_2;

import java.io.*;
import java.util.Scanner;

public class BatchMatesFile {
    public static void main(String[] args) {
        String fileName = "batchmates.txt";
        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter(fileName);
            System.out.print("Enter number of batchmates: ");
            int count = scanner.nextInt();
            scanner.nextLine(); 

            for (int i = 1; i <= count; i++) {
                System.out.print("Enter name of batchmate " + i + ": ");
                String name = scanner.nextLine();
                writer.write(name + "\n");
            }

            writer.close(); 
            System.out.println("\nBatchmates' names written to '" + fileName + "' successfully.\n");

            System.out.println("Reading batchmates from file:");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            int serial = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(serial++ + ". " + line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

