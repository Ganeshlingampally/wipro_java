package Assignment;

public class Standard_Main {
	    public static void main(String[] args) {
	        Standard std = new Standard();

	        // Adding 8 students
	        std.addStudent(new Student("Alice", 80, 90, 85));
	        std.addStudent(new Student("Bob", 75, 95, 80));
	        std.addStudent(new Student("Charlie", 90, 70, 85));
	        std.addStudent(new Student("David", 60, 65, 70));
	        std.addStudent(new Student("Eva", 88, 76, 90));
	        std.addStudent(new Student("Frank", 70, 84, 76));
	        std.addStudent(new Student("Grace", 85, 89, 91));
	        std.addStudent(new Student("Helen", 95, 98, 92));

	        System.out.println("1. Students by Roll No:");
	        std.displayByRollNo();

	        System.out.println("\n2. Student with Highest Percentage:");
	        std.displayHighestPercentage();

	        System.out.println("\n3. Student with Highest Marks in Maths:");
	        std.displayTopMaths();

	        System.out.println("\n4. Students Sorted by Maths + Science Marks:");
	        std.displayByMathsScienceTotal();

	        System.out.println("\n5. All Students with Rank:");
	        std.displayWithRank();
	    }
	}
