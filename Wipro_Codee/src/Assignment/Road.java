package Assignment;

//Base class
class Vehicle {
 protected String color;
 protected int wheels;
 protected String model;

 public Vehicle(String color, int wheels, String model) {
     this.color = color;
     this.wheels = wheels;
     this.model = model;
 }

 public void start() {
     System.out.println(model + " is starting.");
 }

 public void stop() {
     System.out.println(model + " is stopping.");
 }

 public void displayDetails() {
     System.out.println("Model: " + model + ", Color: " + color + ", Wheels: " + wheels);
 }
}

//Truck subclass
class Truck extends Vehicle {
 private int loadCapacity;

 public Truck(String color, String model, int loadCapacity) {
     super(color, 6, model);
     this.loadCapacity = loadCapacity;
 }

 public void carryGoods() {
     System.out.println(model + " is carrying goods up to " + loadCapacity + " kg.");
 }
}

//Bus subclass
class Bus extends Vehicle {
 private int passengerCount;

 public Bus(String color, String model, int passengerCount) {
     super(color, 4, model);
     this.passengerCount = passengerCount;
 }

 public void transportPassengers() {
     System.out.println(model + " is transporting " + passengerCount + " passengers.");
 }
}

//Car subclass
class Car extends Vehicle {
 private boolean acAvailable;

 public Car(String color, String model, boolean acAvailable) {
     super(color, 4, model);
     this.acAvailable = acAvailable;
 }

 public void playMusic() {
     System.out.println(model + " is playing music.");
 }

 public void checkAC() {
     if (acAvailable) {
         System.out.println(model + " has AC.");
     } else {
         System.out.println(model + " does not have AC.");
     }
 }
}

//Road class
public class Road {
 public static void main(String[] args) {
     Truck truck = new Truck("Red", "Volvo Truck", 10000);
     Bus bus = new Bus("Blue", "City Bus", 50);
     Car car = new Car("Black", "Honda Civic", true);

     System.out.println("\n--- Truck Details ---");
     truck.displayDetails();
     truck.start();
     truck.carryGoods();
     truck.stop();

     System.out.println("\n--- Bus Details ---");
     bus.displayDetails();
     bus.start();
     bus.transportPassengers();
     bus.stop();

     System.out.println("\n--- Car Details ---");
     car.displayDetails();
     car.start();
     car.playMusic();
     car.checkAC();
     car.stop();
 }
}

