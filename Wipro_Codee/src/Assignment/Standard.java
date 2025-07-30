package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Standard {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayByRollNo() {
        students.stream()
            .sorted(Comparator.comparingInt(Student::getRollNo))
            .forEach(s -> System.out.println("Roll No: " + s.getRollNo() + ", Name: " + s.getStudName()));
    }

    public void displayHighestPercentage() {
        Student top = Collections.max(students, Comparator.comparingDouble(Student::getPercentage));
        System.out.println("Topper (by percentage): Roll No: " + top.getRollNo() + ", Name: " + top.getStudName());
    }

    public void displayTopMaths() {
        Student topMath = Collections.max(students, Comparator.comparingInt(Student::getMarksInMaths));
        System.out.println("Top in Maths: Roll No: " + topMath.getRollNo() + ", Name: " + topMath.getStudName());
    }

    public void displayByMathsScienceTotal() {
        students.stream()
            .sorted(Comparator.comparingInt(s -> s.getMarksInMaths() + s.getMarksInScience()))
            .forEach(s -> System.out.println("Roll No: " + s.getRollNo() + ", Name: " + s.getStudName()));
    }

    public void displayWithRank() {
        students.sort((s1, s2) -> Integer.compare(s2.getTotalMarks(), s1.getTotalMarks()));
        int rank = 1;
        System.out.println("Rank | Roll No | Name       | Total | %");
        for (Student s : students) {
            System.out.printf("%-5d %-8d %-10s %-6d %.2f%%\n", rank++, s.getRollNo(), s.getStudName(), s.getTotalMarks(), s.getPercentage());
        }
    }


}
