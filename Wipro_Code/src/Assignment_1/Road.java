package Assignment_1;


class Vehicle {
    String color;
    int noOfWheels;
    String model;

    // Constructor
    Vehicle(String color, int noOfWheels, String model) {
        this.color = color;
        this.noOfWheels = noOfWheels;
        this.model = model;
    }

    void start() {
        System.out.println(model + " is starting...");
    }

    void stop() {
        System.out.println(model + " is stopping...");
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Color: " + color + ", Wheels: " + noOfWheels);
    }
}

// Truck subclass
class Truck extends Vehicle {
    Truck(String color, int noOfWheels, String model) {
        super(color, noOfWheels, model);
    }

    void loadGoods() {
        System.out.println(model + " is loading heavy goods.");
    }
}

// Bus subclass
class Bus extends Vehicle {
    Bus(String color, int noOfWheels, String model) {
        super(color, noOfWheels, model);
    }

    void pickPassengers() {
        System.out.println(model + " is picking up passengers.");
    }
}

// Car subclass
class Car extends Vehicle {
    Car(String color, int noOfWheels, String model) {
        super(color, noOfWheels, model);
    }

    void playMusic() {
        System.out.println(model + " is playing music.");
    }
}

// Road class (main class)
public class Road {
    public static void main(String[] args) {
        Truck truck = new Truck("Red", 6, "Tata Truck");
        Bus bus = new Bus("Blue", 4, "Volvo Bus");
        Car car = new Car("White", 4, "Honda City");

        System.out.println("=== TRUCK ===");
        truck.displayInfo();
        truck.start();
        truck.loadGoods();
        truck.stop();

        System.out.println("\n=== BUS ===");
        bus.displayInfo();
        bus.start();
        bus.pickPassengers();
        bus.stop();

        System.out.println("\n=== CAR ===");
        car.displayInfo();
        car.start();
        car.playMusic();
        car.stop();
    }
}
