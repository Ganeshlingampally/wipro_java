package Assignment_1;

import java.util.Scanner;

public class Prgm_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//	    
//		double total=0;
//		while(true) {
//			System.out.println("Enter the product number");
//			int productNumber=sc.nextInt();
//			if(productNumber==0) {
//				break;
//			}
//			System.out.println("Enter Quantity Sold");
//		    int quantity=sc.nextInt();
//		    double price=0;
//		    
//		    switch (productNumber) {
//			case 1:
//				price=22.50;
//				break;
//			case 2:
//				price=44.50;
//			case 3:
//				price=9.98;
//				break;
//			default:
//				System.out.println("Invalid Product Number");
//				continue;
//		    }
//		    double productTotal=price*quantity;
//		    total = total+productTotal;
//		}
//		System.out.println("Total Retail value :"+total);
//		sc.close();
//		}
		Scanner scanner = new Scanner(System.in);

		        double total = 0;

		        while (true) {
		            System.out.println("Enter product number (1 to 3), or 0 to stop:");
		            int productNumber = scanner.nextInt();

		            if (productNumber == 0) {
		                break; // stop when user enters 0
		            }

		            System.out.println("Enter quantity sold:");
		            int quantity = scanner.nextInt();

		            double price = 0;

		            // Using switch to assign price
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
		                    System.out.println("Invalid product number.");
		                    continue; // skip this loop and ask again
		            }

		            doouble productTotal = price * quantity;
		            total = total + productTotal;
		        }

		        System.out.println("Total retail value: ₹" + total);

		        scanner.close();
		    }
		}

