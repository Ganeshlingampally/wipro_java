package Assignment;

import java.util.Scanner;

public class Attendance {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of classes held: ");
	        int totalClasses = sc.nextInt();

	        System.out.print("Enter number of classes attended: ");
	        int attendedClasses = sc.nextInt();

	        double percentage = (attendedClasses * 100.0) / totalClasses;

	        System.out.println("Percentage of classes attended: " + percentage + "%");

	        if (percentage >= 70) {
	            System.out.println("You are allowed to sit in the exam.");
	        } else {
	            System.out.println("You are NOT allowed to sit in the exam.");
	        }

	        sc.close();
	    }
	}
