import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String text) {
        // This line will generate IllegalArgumentException
        String subString = text.substring(2, 0);
        System.out.println("Generated substring: " + subString);
    }

    // Method to handle IllegalArgumentException
    public static void handleIllegalArgumentException(String text) {
        try {
            // This line will generate IllegalArgumentException
            String subString = text.substring(2, 0);
            System.out.println("Generated substring: " + subString);
        } catch (IllegalArgumentException e) {
            // Handle the IllegalArgumentException
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("Caught an Exception: " + e.getMessage());
        }
    }

    // Main Method
    public static void main(String[] args) {
        // Create a Scanner class object
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter a text: ");
        String text = input.nextLine();

        // Call the method to generate IllegalArgumentException
        System.out.println("Generating IllegalArgumentException:");
        try {
            generateIllegalArgumentException(text);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle IllegalArgumentException
        System.out.println("\nHandling IllegalArgumentException:");
        handleIllegalArgumentException(text);

        // Close the Scanner Object
        input.close();
    }
}
