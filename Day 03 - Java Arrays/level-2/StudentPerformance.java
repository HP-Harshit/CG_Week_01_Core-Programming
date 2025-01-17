import java.util.Scanner;

public class StudentPerformance {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();

        // Create arrays to store marks, percentages, and grades of the students
        int[] physics = new int[students];
        int[] chemistry = new int[students];
        int[] maths = new int[students];
        double[] percentages = new double[students];
        char[] grades = new char[students];

        // Take input for marks of students in physics, chemistry, and maths
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            boolean isValid = false;
            while (!isValid) {
                System.out.print("Physics: ");
                physics[i] = input.nextInt();
                System.out.print("Chemistry: ");
                chemistry[i] = input.nextInt();
                System.out.print("Maths: ");
                maths[i] = input.nextInt();

                if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                    System.out.println("Marks must be positive numbers. Please enter again.");
                } else {
                    isValid = true;
                }
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < students; i++) {
            int total = physics[i] + chemistry[i] + maths[i];
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
            System.out.println("Physics: " + physics[i] + ", Chemistry: " + chemistry[i] + ", Maths: " + maths[i]);
            System.out.println("Percentage: " + String.format("%.2f", percentages[i]) + "%, Grade: " + grades[i]);
        }

        // Close the scanner
        input.close();
    }
}
