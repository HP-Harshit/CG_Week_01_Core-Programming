import java.util.Scanner;

public class StudentVotingEligibility {
 
    // Method to generate random 2-digit ages for students using Math.random()
    public static int[] generateRandomAges(int n) {
        // Create an array to store the random ages
        int[] ages = new int[n];
        // Loop through the array to generate random ages
        for (int i = 0; i < n; i++) {
            // Generate a random 2-digit age between 10 and 99
            ages[i] = (int) (Math.random() * 90) + 10; // Generate random age between 10 and 99
        }
        // Return the array of random ages
        return ages;
    }

    // Method to determine voting eligibility
    public static String[][] determineVotingEligibility(int[] ages) {
        // Create a 2D array to store the voting eligibility results
        String[][] result = new String[ages.length][2];
        // Loop through the array to determine voting eligibility
        for (int i = 0; i < ages.length; i++) {
            // Check if the age is 18 or above and store the result
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        // Return the 2D array of voting eligibility results
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayInTabularFormat(String[][] data) {
        // Print the header row
        System.out.println("Age\tEligibility");
        // Loop through the 2D array to print the data in a tabular format
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create a scanner class object
        Scanner input = new Scanner(System.in);

        // Take user input for the number of students (assuming 10)
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Generate random ages for the students
        int[] ages = generateRandomAges(numberOfStudents);

        // Determine voting eligibility
        String[][] votingEligibility = determineVotingEligibility(ages);

        // Display the result in tabular format
        displayInTabularFormat(votingEligibility);

        // Close the Scanner object
        input.close();
    }
}
