package Assignment;

import static java.lang.System.out; 
public class HouseTest {

    static class Hall {
        public void displayMessage() {
            out.println("This is the first room while entering the house"); 
        }
    }

    static class Kitchen {
        public void showAppliances() {
            String[] appliances = {"Fridge", "Microwave", "Stove", "Toaster"};

            System.out.println("Kitchen Appliances:");
            for (String item : appliances) {
                System.out.println("- " + item);
            }

            // Copying to another array
            String[] copiedAppliances = java.util.Arrays.copyOf(appliances, appliances.length);

            System.out.println("\nCopied Appliances:");
            for (String item : copiedAppliances) {
                System.out.println("- " + item);
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Hall hall = new Hall();
        hall.displayMessage();

        System.out.println();

        Kitchen kitchen = new Kitchen();
        kitchen.showAppliances();
    }
}

