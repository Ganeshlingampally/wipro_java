package Assignment_2;

public class Tank {
    private boolean isFilled;
    private boolean isReleased;

    public Tank() {
        isFilled = false;
        isReleased = false;
        System.out.println("Tank created.");
    }

    public void fill() {
        isFilled = true;
        System.out.println("Tank filled.");
    }

    public void empty() {
        if (isFilled) {
            isFilled = false;
            System.out.println("Tank emptied.");
        } else {
            System.out.println("Tank is already empty.");
        }
    }

    public void releaseTank() {
        if (!isReleased) {
            isReleased = true;
            System.out.println("Tank released properly.");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            if (!isReleased) {
                System.out.println("Error: Tank was not released before cleanup!");
            } else {
                System.out.println("Tank finalized correctly.");
            }
        } finally {
            super.finalize();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Scenario 1: Properly released tank
        Tank t1 = new Tank();
        t1.fill();
        t1.empty();
        t1.releaseTank();  // Proper cleanup

        // Scenario 2: Forgot to release tank
        Tank t2 = new Tank();
        t2.fill();
        t2.empty();
        // No releaseTank() called

        // Make objects eligible for GC
        t1 = null;
        t2 = null;

        // Request garbage collection
        System.gc();

        // Delay to allow finalize() to run
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main()");
    }
}

