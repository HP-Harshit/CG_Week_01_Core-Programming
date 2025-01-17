import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        // Validate for negative age
        if (age < 0) {
            return false;
        }
        // Check if the age is 18 or above
        if (age >= 18) {
            return true;
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        // Create a StudentVoteChecker class object
        StudentVoteChecker classObject = new StudentVoteChecker();

        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Create an array of size 10 to store the ages of the students
        int[] age = new int[10];

        // Take user input for the ages
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the age of student " + (i + 1) + ": ");
            age[i] = input.nextInt();
        }

        // Call the canStudentVote method and display the results
        for (int i = 0; i < 10; i++) {
            if (classObject.canStudentVote(age[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        // Close the Scanner object
        input.close();
    }
}
