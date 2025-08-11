package Assignment_1;

public class PersonActivity {
	 public static void main(String[] args) {
	     Person athlete = new Athlete();
	     Person lazy = new LazyPerson();

	     System.out.println("=== Athlete ===");
	     athlete.eat();
	     athlete.exercise();

	     System.out.println("\n=== Lazy Person ===");
	     lazy.eat();
	     lazy.exercise();
	 }}
