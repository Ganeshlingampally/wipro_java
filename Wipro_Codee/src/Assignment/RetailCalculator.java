package Assignment;

import java.util.Scanner;

public class RetailCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalRetailValue = 0.0;
        char continueChoice;

        do {
            System.out.print("Enter product number (1-3): ");
            int productNumber = sc.nextInt();

            System.out.print("Enter quantity sold: ");
            int quantity = sc.nextInt();

            double price = 0.0;

            switch (productNumber) {
                case 1:
                    price = 22.50;
                    break;
                case 2:
                    price = 44.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                default:
                    System.out.println("Invalid product number!");
                    price = 0.0;
                    break;
            }

            if (price != 0.0) {
                double productTotal = price * quantity;
                totalRetailValue += productTotal;
                System.out.println("Subtotal for this product: ₹" + productTotal);
            }

            System.out.print("Do you want to enter another product? (Y/N): ");
            continueChoice = sc.next().toUpperCase().charAt(0);

        } while (continueChoice == 'Y');

        System.out.println("\nTotal retail value of all products sold: ₹" + totalRetailValue);

        sc.close();
    }
}

