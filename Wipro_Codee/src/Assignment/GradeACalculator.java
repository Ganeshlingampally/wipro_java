package Assignment;

public class GradeACalculator {
    public static void main(String[] args) {
        int totalStudents = 90;
        int totalBoys = 45;

        int totalGradeAStudents = totalStudents / 2; // 50% of 90 = 45
        int gradeABoys = 20;

        int gradeAGirls = totalGradeAStudents - gradeABoys;

        System.out.println("Total number of girls getting grade 'A': " + gradeAGirls);
    }
}

