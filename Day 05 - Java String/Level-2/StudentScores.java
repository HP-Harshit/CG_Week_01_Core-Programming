import java.util.Scanner;

public class StudentScores {

    // Method to generate random 2-digit scores for Physics, Chemistry and Math
    // (PCM)
    public static int[][] generateRandomScores(int n) {
        // Create an array to store the scores
        int[][] scores = new int[n][3];
        // Loop through each student
        for (int i = 0; i < n; i++) {
            // Generate random scores for each subject
            scores[i][0] = (int) (Math.random() * 90) + 10; // Physics score
            scores[i][1] = (int) (Math.random() * 90) + 10; // Chemistry score
            scores[i][2] = (int) (Math.random() * 90) + 10; // Math score
        }
        // Return the array of scores
        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateScores(int[][] scores) {
        // Create an array to store the results
        double[][] result = new double[scores.length][4]; // [total, average, percentage, rounded percentage]
        // Loop through each student
        for (int i = 0; i < scores.length; i++) {
            // Calculate the total score
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            // Calculate the average score
            double average = total / 3.0;
            // Calculate the percentage score
            double percentage = (total / 300.0) * 100;
            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
            // Round the percentage score to the nearest whole number
            result[i][3] = Math.round(percentage * 100.0) / 100.0;
        }
        // Return the array of results
        return result;
    }

    // Method to calculate the grade based on the percentage
    public static String[][] calculateGrades(double[][] scores) {
        // Create an array to store the grades
        String[][] grades = new String[scores.length][1];
        // Loop through each student
        for (int i = 0; i < scores.length; i++) {
            // Determine the grade based on the percentage
            double percentage = scores[i][3];
            if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "F";
            }
        }
        // Return the array of grades
        return grades;
    }

    // Method to display the scorecard of all students in a tabular format
    public static void displayScorecard(int[][] scores, double[][] calculatedScores, String[][] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] +
                    "\t" + calculatedScores[i][0] + "\t" + calculatedScores[i][1] + "\t" + calculatedScores[i][3] +
                    "\t\t" + grades[i][0]);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create a sanner class object
        Scanner input = new Scanner(System.in);

        // Take user input for the number of students
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Generate random scores for the students
        int[][] scores = generateRandomScores(numberOfStudents);

        // Calculate the total, average, and percentage for each student
        double[][] calculatedScores = calculateScores(scores);

        // Calculate the grades based on the percentage
        String[][] grades = calculateGrades(calculatedScores);

        // Display the scorecard of all students in a tabular format
        displayScorecard(scores, calculatedScores, grades);

        // Close the Scanner object
        input.close();
    }
}
