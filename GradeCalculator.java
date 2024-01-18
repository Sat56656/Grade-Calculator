import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Arrays to store student names and grades
        String[] studentNames = new String[numStudents];
        double[] grades = new double[numStudents];

        // Input student details and grades
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.next();

            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        // Calculate average grade
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / numStudents;

        // Display results
        System.out.println("\nStudent\t\tGrade");
        System.out.println("---------------------");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(studentNames[i] + "\t\t" + grades[i]);
        }
        System.out.println("---------------------");
        System.out.println("Average Grade: " + average);

        scanner.close();
    }
}
