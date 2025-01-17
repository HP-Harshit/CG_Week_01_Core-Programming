import java.util.Scanner;

public class NumberCheck {

    // Method to check number status
    int numberChecker(int number) {
        // Checking the number
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        }
        return 0;
    }

    // Main method
    public static void main(String[] args) {
        // Create a main class object to call methods
        NumberCheck classObject = new NumberCheck();

        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for a number
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Display the result
        switch (classObject.numberChecker(number)) {
            case 1:
                System.out.println("The number is Positive");
                break;
            case -1:
                System.out.println("The number is Negative");
                break;
            case 0:
                System.out.println("The number is Zero");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }

        // Close the Scanner object
        input.close();
    }
}
