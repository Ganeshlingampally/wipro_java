package Assignment;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] speeds = new double[5];
        double sum = 0;

        System.out.println("Enter speed of 5 bikers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Speed of Biker " + (i + 1) + ": ");
            speeds[i] = scanner.nextDouble();
            sum += speeds[i];
        }

        double average = sum / 5;
        System.out.println("\nAverage Speed: " + average);

        System.out.println("Qualifying Biker Speeds (greater than average):");
        boolean found = false;
        for (double speed : speeds) {
            if (speed > average) {
                System.out.println(speed);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No biker qualified.");
        }

        scanner.close();
    }
}
//Enter speed of 5 bikers:
//Speed of Biker 1: 60
//Speed of Biker 2: 50
//Speed of Biker 3: 80
//Speed of Biker 4: 40
//Speed of Biker 5: 70
//
//Average Speed: 60.0
//Qualifying Biker Speeds (greater than average):
//80.0
//70.0

