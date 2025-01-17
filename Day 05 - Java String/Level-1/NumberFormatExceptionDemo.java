import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        // This line will generate NumberFormatException
        int number = Integer.parseInt(text);
        System.out.println("Generated number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleNumberFormatException(String text) {
        try {
            // This line will generate NumberFormatException
            int number = Integer.parseInt(text);
            System.out.println("Generated number: " + number);
        } catch (NumberFormatException e) {
            // Handle the NumberFormatException
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("Caught an Exception: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create a Scanner class object
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter a text: ");
        String text = input.nextLine();

        // Call the method to generate NumberFormatException
        System.out.println("Generating NumberFormatException:");
        try {
            generateNumberFormatException(text);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle NumberFormatException
        System.out.println("\nHandling NumberFormatException:");
        handleNumberFormatException(text);

        // Close the Scanner object
        input.close();
    }
}
