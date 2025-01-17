import java.util.Scanner;

public class HandshakesResult {

    // Method to calculate the number of handshakes
    int handshakesCalculator(int numberOfStudents) {
        // Calculating the number of handshakes and returning the result
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    // Main method
    public static void main(String[] args) {
        // Create a main class object to call methods
        HandshakesResult handshakesObject = new HandshakesResult();

        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for number of students
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Create a variable to store number of handshakes
        int numberOfHandshakes = handshakesObject.handshakesCalculator(numberOfStudents);

        // Displaying the result
        System.out.println("The total number of handshakes is: " + numberOfHandshakes);

        // Close the Scanner object
        input.close();
    }
}
