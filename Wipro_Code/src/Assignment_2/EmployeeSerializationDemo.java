package Assignment_2;

import java.io.*;
import java.util.Scanner;

// Employee class with Serializable and transient salary
class Employee implements Serializable {
    private int emp_id;
    private String emp_name;
    private transient double emp_sal;  // Not serialized

    public Employee(int emp_id, String emp_name, double emp_sal) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_sal = emp_sal;
    }

    public void display() {
        System.out.println("Employee ID   : " + emp_id);
        System.out.println("Employee Name : " + emp_name);
        System.out.println("Employee Salary (not serialized): " + emp_sal);
    }
}

public class EmployeeSerializationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();  // Clear newline

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            // Create object
            Employee emp = new Employee(id, name, salary);

            // Serialize
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));
            oos.writeObject(emp);
            oos.close();
            System.out.println("\nEmployee object serialized to 'employee.ser'");

            // Deserialize
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("\nDeserialized Employee object:");
            deserializedEmp.display();  // emp_sal will be 0.0
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}



