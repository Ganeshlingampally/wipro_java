package Assignment;

public class Tank {
    private boolean isFilled = false;
    private boolean isReleased = false;

    // Fill the tank
    public void fill() {
        isFilled = true;
        System.out.println("Tank filled.");
    }

    // Empty the tank
    public void empty() {
        if (isFilled) {
            isFilled = false;
            System.out.println("Tank emptied.");
        } else {
            System.out.println("Tank is already empty.");
        }
    }

    // Release tank resources (cleanup method)
    public void releaseTank() {
        if (!isReleased) {
            isReleased = true;
            System.out.println("Tank resources released.");
        }
    }

    // Finalize method to verify if tank was properly released
    @Override
    protected void finalize() throws Throwable {
        try {
            if (!isReleased) {
                System.out.println("Error: Tank was not released before cleanup!");
            } else {
                System.out.println("Tank finalized successfully.");
            }
        } finally {
            super.finalize();
        }
    }

    // Main method to test different scenarios
    public static void main(String[] args) {
        // Case 1: Proper usage
        System.out.println("\n--- Scenario 1: Proper Usage ---");
        Tank tank1 = new Tank();
        tank1.fill();
        tank1.empty();
        tank1.releaseTank();
        tank1 = null; // Make eligible for GC

        // Case 2: Improper usage (no release)
        System.out.println("\n--- Scenario 2: Missing releaseTank() ---");
        Tank tank2 = new Tank();
        tank2.fill();
        tank2.empty();
        tank2 = null; // No releaseTank() call

        // Request GC (may or may not call finalize immediately)
        System.gc();

        // Add a small delay to give GC a chance (not guaranteed)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }

        System.out.println("\nMain method ends.");
    }
}

//--- Scenario 1: Proper Usage ---
//Tank filled.
//Tank emptied.
//Tank resources released.
//
//--- Scenario 2: Missing releaseTank() ---
//Tank filled.
//Tank emptied.
//Error: Tank was not released before cleanup!
//
//Main method ends.

