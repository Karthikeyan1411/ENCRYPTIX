
import java.util.Scanner;

public class StudentGrafeCalculator implements GradeCalculator {
    private int[] marks;
    private int total = 0;
    private float average = 0;
    private String grade;

    private Scanner scan = new Scanner(System.in);

    @Override
    public void inputMarks() {
        System.out.println("Enter number of subjects: ");
        marks = new int[scan.nextInt()];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for Subject " + (i+1) + ": ");
            marks[i] = scan.nextInt();
        }
    }

    @Override
    public void calculateTotalAndAverage() {
        total = 0;
        for (int x : marks) {
            total += x;
        }
        average = (float) total / marks.length;
    }

    @Override
    public void calculateGrade() {
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    @Override
    public void displayResult() {
        System.out.println("Results: ");
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
    }
}
