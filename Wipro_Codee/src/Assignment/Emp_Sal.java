package Assignment;

import java.util.Scanner;

public class Emp_Sal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();
        if (yearsOfService > 6) {
            double bonus = salary * 0.10;
            System.out.println("You are eligible for a bonus of:" + bonus);
        } else {
            System.out.println("You are not eligible for a bonus");
        }

        scanner.close();


	}


}
