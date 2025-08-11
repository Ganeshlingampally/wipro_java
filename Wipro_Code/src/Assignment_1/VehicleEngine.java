package Assignment_1;



abstract class VehicleEngine {
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

public class VehicleEngine {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        System.out.println("=== Car ===");
        car.startEngine();
        car.stopEngine();

        System.out.println("=== Motorcycle ===");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
