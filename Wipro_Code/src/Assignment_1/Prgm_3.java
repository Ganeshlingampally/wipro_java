package Assignment_1;

import java.util.Scanner;

public class Prgm_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.println("Enter your name : ");
		        String name = scanner.nextLine();

		        System.out.print("Enter your roll number : ");
		        String rollNumber = scanner.nextLine();

		        System.out.print("Enter your field of interest : ");
		        String interest = scanner.nextLine();

		        // Printing the message
		        System.out.println("Hey, my name is "+name+" and my roll number is "+rollNumber + 
		                           " My field of interest are "+interest);

		        scanner.close();
		    }
		

	}
