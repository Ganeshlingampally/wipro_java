package Assignment;

public class VandalurZoo {

    static class Animal {
        String name;
        String color;
        int weight;
        int age;
        boolean vegetarian;
        boolean canClimb;
        String sound;

        Animal(String name, String color, int weight, int age, boolean vegetarian, boolean canClimb, String sound) {
            this.name = name;
            this.color = color;
            this.weight = weight;
            this.age = age;
            this.vegetarian = vegetarian;
            this.canClimb = canClimb;
            this.sound = sound;
        }

        void displayDetails() {
            System.out.println("\n=== " + name + " ===");
            System.out.println("Color: " + color);
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Age: " + age + " years");
            System.out.println("Is Vegetarian: " + vegetarian);
            System.out.println("Can Climb: " + canClimb);
            System.out.println("Sound: " + sound);
        }
    }

    public static void main(String[] args) {
        Animal lion = new Animal("Lion", "Golden", 190, 8, false, false, "Roar");
        Animal tiger = new Animal("Tiger", "Orange with Black Stripes", 220, 10, false, true, "Growl");
        Animal deer = new Animal("Deer", "Brown", 60, 4, true, false, "Bleat");
        Animal monkey = new Animal("Monkey", "Gray", 35, 5, true, true, "Chatter");
        Animal elephant = new Animal("Elephant", "Gray", 5000, 25, true, false, "Trumpet");
        Animal giraffe = new Animal("Giraffe", "Yellow with brown patches", 800, 12, true, false, "Hum");

        // Display characteristics
        lion.displayDetails();
        tiger.displayDetails();
        deer.displayDetails();
        monkey.displayDetails();
        elephant.displayDetails();
        giraffe.displayDetails();
    }
}

