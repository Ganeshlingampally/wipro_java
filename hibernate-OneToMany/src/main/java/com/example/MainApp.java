package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n-----------------------------");
            System.out.println("   Hibernate One-To-Many CRUD");
            System.out.println("-----------------------------");
            System.out.println("1. Create Account with Transactions");
            System.out.println("2. View Account and Transactions");
            System.out.println("3. Add Transaction to Existing Account");
            System.out.println("4. Delete Account");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> createAccount(sc);
                case 2 -> viewAccount(sc);
                case 3 -> addTransaction(sc);
                case 4 -> deleteAccount(sc);
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
        HibernateUtil.getSessionFactory().close();
    }

    private static void createAccount(Scanner sc) {
        System.out.print("Enter account name: ");
        String name = sc.nextLine();

        Account account = new Account(name);

        System.out.print("Enter number of transactions: ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Transaction description: ");
            String desc = sc.nextLine();
            System.out.print("Amount: ");
            double amt = sc.nextDouble();
            sc.nextLine();
            account.addTransaction(new TransactionEntity(desc, amt));
        }

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(account);
        tx.commit();
        session.close();

        System.out.println("Account created with transactions.");
    }

    private static void viewAccount(Scanner sc) {
        System.out.print("Enter account ID: ");
        int id = sc.nextInt();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Account acc = session.get(Account.class, id);

        if (acc != null) {
            System.out.println(acc);
            acc.getTransactions().forEach(System.out::println);
        } else {
            System.out.println("Account not found.");
        }
        session.close();
    }

    private static void addTransaction(Scanner sc) {
        System.out.print("Enter account ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Account acc = session.get(Account.class, id);

        if (acc != null) {
            System.out.print("Transaction description: ");
            String desc = sc.nextLine();
            System.out.print("Amount: ");
            double amt = sc.nextDouble();

            TransactionEntity newTx = new TransactionEntity(desc, amt);
            acc.addTransaction(newTx);
            session.update(acc);
            tx.commit();
            System.out.println("Transaction added.");
        } else {
            System.out.println("Account not found.");
            tx.rollback();
        }

        session.close();
    }

    private static void deleteAccount(Scanner sc) {
        System.out.print("Enter account ID: ");
        int id = sc.nextInt();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Account acc = session.get(Account.class, id);

        if (acc != null) {
            session.delete(acc);
            tx.commit();
            System.out.println("Account deleted.");
        } else {
            System.out.println("Account not found.");
            tx.rollback();
        }

        session.close();
    }
}
