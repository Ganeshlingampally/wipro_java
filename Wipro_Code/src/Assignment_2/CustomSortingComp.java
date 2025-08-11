package Assignment_2;

import java.util.*;

//Employee class with fields, constructor, and toString
class Empl {
 int id;
 String name;
 double salary;

 public Empl(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }

 // toString() for readable output
 @Override
 public String toString() {
     return "Employee{" + "ID=" + id + ", Name='" + name + '\'' + ", Salary=" + salary + '}';
 }
}

public class CustomSortingComp {
 public static void main(String[] args) {
     // Step 1: Create and add Employee objects
     List<Employee> employeeList = new ArrayList<>();
     employeeList.add(new Employee(101, "Ravi", 60000));
     employeeList.add(new Employee(102, "Anita", 75000));
     employeeList.add(new Employee(103, "Kiran", 50000));
     employeeList.add(new Employee(104, "Suresh", 75000));

     // Step 2: Sort by salary in descending order using Comparator
     employeeList.sort(Comparator.comparingDouble(Employee::getSalary).reversed());

     System.out.println("Sorted by Salary (Descending):");
     for (Employee emp : employeeList) {
         System.out.println(emp);
     }

     // Step 3: Sort by name using lambda (alphabetically)
     employeeList.sort((e1, e2) -> e1.name.compareToIgnoreCase(e2.name));

     System.out.println("\nSorted by Name (Alphabetically):");
     for (Employee emp : employeeList) {
         System.out.println(emp);
     }
 }
}

//Add getter for salary
class Emp {
 // ... same as above ...
 public double getSalary() {
     return salary;
 }
}

