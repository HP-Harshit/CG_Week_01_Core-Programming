import java.util.Scanner;

public class StudentPerformance2 {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();

        // Create a 2D array to store marks in physics, chemistry, and maths
        int[][] marks = new int[students][3];
        double[] percentages = new double[students];
        char[] grades = new char[students];

        // Take input for marks of students in physics, chemistry, and maths
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            boolean isValid = false;
            while (!isValid) {
                System.out.print("Physics: ");
                marks[i][0] = input.nextInt();
                System.out.print("Chemistry: ");
                marks[i][1] = input.nextInt();
                System.out.print("Maths: ");
                marks[i][2] = input.nextInt();

                if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                    System.out.println("Marks must be positive numbers. Please enter again.");
                } else {
                    isValid = true;
                }
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Display the results
        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2]);
            System.out.println("Percentage: " + String.format("%.2f", percentages[i]) + "%, Grade: " + grades[i]);
        }

        // Close the scanner
        input.close();
    }
}
