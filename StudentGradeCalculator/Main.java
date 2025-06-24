package StudentGradeCalculator;

public class Main {
    public static void main(String[] args) {
        GradeCalculator calculator = new StudentGrafeCalculator();
        calculator.inputMarks();
        calculator.calculateTotalAndAverage();
        calculator.calculateGrade();
        calculator.displayResult();
    }
}
