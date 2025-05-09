import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
        }

        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double averagePercentage = (double)totalMarks / numSubjects;

        String grade;

        if (averagePercentage >= 90) {
            grade = "O";
        } else if (averagePercentage >= 80) {
            grade = "A+";
        }else if (averagePercentage >=70) {
            grade = "A";
        } else if (averagePercentage >= 60) {
            grade = "B+";
        } else if (averagePercentage >= 50) {
            grade = "B";
        }else if (averagePercentage >=40){
            grade = "p";
        } else {
            grade = "F";
        }

        System.out.println("Results:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);
    }
}