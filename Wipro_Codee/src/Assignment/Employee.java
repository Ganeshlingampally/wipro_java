package Assignment;

public class Employee {
    private String empId;
    private String name;
    private int yearOfBirth;

    private int idYear;
    private char designation;
    private int number;

    // Constructor
    public Employee(String empId, String name, int yearOfBirth) {
        this.empId = empId;
        this.name = name;
        this.yearOfBirth = yearOfBirth;

        // Parse the empId format: YY-D-XXX
        parseEmpId();
    }

    // Method to parse empId
    private void parseEmpId() {
        try {
            String[] parts = empId.split("-");
            if (parts.length != 3) {
                throw new IllegalArgumentException("Invalid Employee ID format");
            }
            idYear = Integer.parseInt(parts[0]);
            designation = parts[1].charAt(0);
            number = Integer.parseInt(parts[2]);
        } catch (Exception e) {
            System.out.println("Error parsing empId: " + e.getMessage());
        }
    }

    // Method to display employee details
    public void display() {
        System.out.println("----- Employee Details -----");
        System.out.println("Name            : " + name);
        System.out.println("Year of Birth   : " + yearOfBirth);
        System.out.println("Employee ID     : " + empId);
        System.out.println("Parsed Year     : " + idYear);
        System.out.println("Designation     : " + (designation == 'F' ? "Faculty" : "Staff"));
        System.out.println("ID Number       : " + number);
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        Employee e1 = new Employee("81-F-112", "Alice", 1980);
        Employee e2 = new Employee("79-S-254", "Bob", 1979);

        e1.display();
        e2.display();
    }
}


//----- Employee Details -----
//Name            : Alice
//Year of Birth   : 1980
//Employee ID     : 81-F-112
//Parsed Year     : 81
//Designation     : Faculty
//ID Number       : 112
//
//----- Employee Details -----
//Name            : Bob
//Year of Birth   : 1979
//Employee ID     : 79-S-254
//Parsed Year     : 79
//Designation     : Staff
//ID Number       : 254

