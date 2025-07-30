package Assignment;

public class VehicleTest {

    // Abstract class
    abstract static class Vehicle {
        String brand;

        public Vehicle(String brand) {
            this.brand = brand;
        }

        public abstract void startEngine();
        public abstract void stopEngine();
    }

    // Subclass: Car
    static class Car extends Vehicle {
        public Car(String brand) {
            super(brand);
        }

        @Override
        public void startEngine() {
            System.out.println("Car (" + brand + ") engine started with a key."); // Output: Car (Honda) engine started with a key.
        }

        @Override
        public void stopEngine() {
            System.out.println("Car (" + brand + ") engine stopped."); // Output: Car (Honda) engine stopped.
        }
    }

    // Subclass: Motorcycle
    static class Motorcycle extends Vehicle {
        public Motorcycle(String brand) {
            super(brand);
        }

        @Override
        public void startEngine() {
            System.out.println("Motorcycle (" + brand + ") engine started with a kick."); // Output: Motorcycle (Royal Enfield) engine started with a kick.
        }

        @Override
        public void stopEngine() {
            System.out.println("Motorcycle (" + brand + ") engine stopped."); // Output: Motorcycle (Royal Enfield) engine stopped.
        }
    }

    // Main method
    public static void main(String[] args) {
        Vehicle myCar = new Car("Honda");
        Vehicle myBike = new Motorcycle("Royal Enfield");

        System.out.println("== Car Actions =="); // Output: == Car Actions ==
        myCar.startEngine();
        myCar.stopEngine();

        System.out.println("\n== Motorcycle Actions =="); // Output: == Motorcycle Actions ==
        myBike.startEngine();
        myBike.stopEngine();
    }
}
//== Car Actions ==
//Car (Honda) engine started with a key.
//Car (Honda) engine stopped.

//== Motorcycle Actions ==
//Motorcycle (Royal Enfield) engine started with a kick.
//Motorcycle (Royal Enfield) engine stopped.

