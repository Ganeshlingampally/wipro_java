package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        List<Bank> customers = new ArrayList<>();

        // Sample data
        customers.add(new Saving("S101", "Alice", 2, "Engineer", 5000.0, 0.05));
        customers.add(new Current("C102", "Bob", 1, "Doctor", 8000.0, 0.04, true));
        customers.add(new Current("C103", "Charlie", 1, "Teacher", 6000.0, 0.03, false));
        customers.add(new Saving("S104", "Diana", 2, "Nurse", 7000.0, 0.04));

        Scanner sc = new Scanner(System.in);

        // a) Display all balances
        System.out.println("=== Customer Balances ===");
        for (Bank b : customers) {
            System.out.println("\n" + b);
            System.out.println("Updated Balance: RM " + b.calcBalance());
        }

        // b) Search by account number
        System.out.print("\nEnter account number to search: ");
        String searchAcc = sc.next();
        boolean found = false;

        for (Bank b : customers) {
            if (b.getAccNo().equalsIgnoreCase(searchAcc)) {
                System.out.println("\n--- Customer Found ---");
                System.out.println(b);
                System.out.println("Updated Balance: RM " + b.calcBalance());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account number " + searchAcc + " not found.");
        }

        // c) Count Current account holders and total balance
        int count = 0;
        double totalBalance = 0;

        for (Bank b : customers) {
            if (b instanceof Current) {
                count++;
                totalBalance += b.calcBalance();
            }
        }

        System.out.println("\nNumber of Current Account Customers: " + count);
        System.out.println("Total Balance in Current Accounts: RM " + totalBalance);
    }
}

