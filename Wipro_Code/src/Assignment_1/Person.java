package Assignment_1;

//Abstract class
abstract class Person {
 abstract void eat();
 abstract void exercise();
}

//Subclass Athlete
class Athlete extends Person {
 @Override
 void eat() {
     System.out.println("Athlete eats a high-protein, balanced diet.");
 }

 @Override
 void exercise() {
     System.out.println("Athlete exercises vigorously every day.");
 }
}

//Subclass LazyPerson
class LazyPerson extends Person {
 @Override
 void eat() {
     System.out.println("Lazy person eats junk food and snacks often.");
 }

 @Override
 void exercise() {
     System.out.println("Lazy person rarely exercises or avoids it.");
 }
}

