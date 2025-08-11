package Assignment_1;

import java.util.*;

public class Standard {
    private List<Student> students;

    public Standard() {
        students = new ArrayList<>();

        students.add(new Student("Ajay", 75, 80, 70));
        students.add(new Student("Bhanu", 88, 92, 81));
        students.add(new Student("Chitra", 60, 75, 78));
        students.add(new Student("Deepak", 91, 95, 89));
        students.add(new Student("Esha", 85, 82, 79));
        students.add(new Student("Farhan", 70, 73, 68));
        students.add(new Student("Geeta", 78, 89, 91));
        students.add(new Student("Hari", 68, 60, 65));
    }

    public void displayRollNoAndNameByRollNo() {
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRollNo))
                .forEach(s -> System.out.println("RollNo: " + s.getRollNo() + ", Name: " + s.getStudName()));
    }

    public void displayTopperByPercentage() {
        Student topper = Collections.max(students, Comparator.comparingDouble(Student::getPercentage));
        System.out.println("Topper - RollNo: " + topper.getRollNo() + ", Name: " + topper.getStudName());
    }

    public void displayTopperInMaths() {
        Student topper = Collections.max(students, Comparator.comparingInt(Student::getMarksInMaths));
        System.out.println("Topper in Maths - RollNo: " + topper.getRollNo() + ", Name: " + topper.getStudName());
    }

    public void displayByMathsAndScienceTotal() {
        students.stream()
                .sorted(Comparator.comparingInt(s -> s.getMarksInMaths() + s.getMarksInScience()))
                .forEach(s -> System.out.println("RollNo: " + s.getRollNo() + ", Name: " + s.getStudName()));
    }

    public void displayAllWithRank() {
        List<Student> ranked = new ArrayList<>(students);
        ranked.sort((s1, s2) -> Double.compare(s2.getPercentage(), s1.getPercentage()));

        int rank = 1;
        for (Student s : ranked) {
            System.out.println("Rank: " + rank++
                    + ", RollNo: " + s.getRollNo()
                    + ", Name: " + s.getStudName()
                    + ", Total: " + s.getTotalMarks()
                    + ", Percentage: " + String.format("%.2f", s.getPercentage()) + "%");
        }
    }

    public static void main(String[] args) {
        Standard stand = new Standard();
        System.out.println("\n1. Roll No and Name (by Roll No):");
        stand.displayRollNoAndNameByRollNo();

        System.out.println("\n2. Topper by Percentage:");
        stand.displayTopperByPercentage();

        System.out.println("\n3. Topper in Maths:");
        stand.displayTopperInMaths();

        System.out.println("\n4. Roll No and Name (by Maths + Science):");
        stand.displayByMathsAndScienceTotal();

        System.out.println("\n5. All Student Details with Rank:");
        stand.displayAllWithRank();
    }
}
