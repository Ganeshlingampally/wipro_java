package Assignment_1;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] speeds = new int[5];
        int total = 0;

        // Input speeds
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter speed of racer " + (i + 1) + ": ");
            speeds[i] = sc.nextInt();
            total += speeds[i];
        }

        // Calculate average
        double average = total / 5.0;
        System.out.println("\nAverage speed: " + average);

        // Print qualifying racers
        System.out.println("Qualifying racers (speed > average):");
        for (int speed : speeds) {
            if (speed > average) {
                System.out.println(speed);
            }
        }

        sc.close();
    }
}
