package Assignment_1;

import java.util.Scanner;

public class Prgm_7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter the no.of classes held :");
		 int totalClasses=sc.nextInt();
		 System.out.print("Enter the no.of classes Attended :");
		 int ClassesAttended=sc.nextInt();
		 
		 double percentage = ClassesAttended*100/totalClasses;
		 System.out.println("Attendance Percentage is : "+percentage);
		 
//		 if(percentage>=70) {
//			 System.out.println("You are Allowed to write Exam");
//		 }else {
//			 System.out.println("You are Not Allowed to write Exam");
//		 }
		 
		 
		 System.out.println("Do you have Medical Cause ?");
		 char medicalCause = sc.next().charAt(0);
		 if(percentage<=70 || medicalCause=='Y' || medicalCause=='y') {
			 System.out.println("You are Allowed to write Exam");
			 }else {
				 System.out.println("You are Not Allowed to write Exam");
			 }
		 
	}
}
