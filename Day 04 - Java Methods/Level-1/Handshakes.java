import java.util.Scanner;

public class Handshakes {

    // Method to calculate number of handshakes
    int handshakesCalculator(int students) {
        // Calculating the number of handshakes and returning the result
        return (students * (students - 1)) / 2;
    }

    // Main method
    public static void main(String[] args) {
        // Create a main class object to call methods
        Handshakes handshakesObject = new Handshakes();

        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for number of students
        System.out.println("Enter the number of students: ");
        int students = input.nextInt();

        // Create a variable to store number of handshakes
        int numberOfHandshakes = handshakesObject.handshakesCalculator(students);

        // Displaying the result
        System.out.println("The total number of handshakes are: " + numberOfHandshakes);

        // Close the Scanner object
        input.close();
    }
}
