package Assignment;

public class PersonTest {

    // Abstract class
    abstract static class Person {
        public abstract void eat();
        public abstract void exercise();
    }

    // Subclass: Athlete
    static class Athlete extends Person {
        @Override
        public void eat() {
            System.out.println("Athlete eats a high-protein diet."); // Output: Athlete eats a high-protein diet.
        }

        @Override
        public void exercise() {
            System.out.println("Athlete exercises for 3 hours daily."); // Output: Athlete exercises for 3 hours daily.
        }
    }

    // Subclass: LazyPerson
    static class LazyPerson extends Person {
        @Override
        public void eat() {
            System.out.println("Lazy person eats junk food while watching TV."); // Output: Lazy person eats junk food while watching TV.
        }

        @Override
        public void exercise() {
            System.out.println("Lazy person skips exercise and sleeps instead."); // Output: Lazy person skips exercise and sleeps instead.
        }
    }

    // Main method
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazy = new LazyPerson();

        System.out.println("== Athlete's Routine ==");
        athlete.eat();
        athlete.exercise();

        System.out.println("\n== Lazy Person's Routine ==");
        lazy.eat();
        lazy.exercise();
    }
}

