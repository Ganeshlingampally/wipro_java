package Assignment_2;

public class RethrowExample {

    static void someMethod2() throws Exception {
        System.out.println("Inside someMethod2");
        throw new Exception("Exception thrown in someMethod2");
    }

    static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("Caught exception in someMethod: " + e.getMessage());
            throw e;  // Rethrow the caught exception
        }
    }

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("Caught rethrown exception in main");
            e.printStackTrace(); // Print stack trace for debugging
        }
    }
}

