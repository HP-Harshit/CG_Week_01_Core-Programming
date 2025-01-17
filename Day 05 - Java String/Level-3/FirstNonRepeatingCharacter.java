import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in a string using charAt()
    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256]; // Array to store frequency of characters

        // Loop through the text to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Increment the frequency of the character
            frequency[c]++;
        }

        // Loop through the text again to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // If the frequency of the character is 1, return the character
            if (frequency[c] == 1) {
                return c;
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }

    // Main method
    public static void main(String[] args) {

        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for string
        System.out.println("Enter text: ");
        String text = input.nextLine();

        // Find the first non-repeating character using user-defined method
        char firstNonRepeatingChar = findFirstNonRepeatingChar(text);

        // Display the result
        if (firstNonRepeatingChar != '\0') {
            System.out.println("The first non-repeating character in the text is: " + firstNonRepeatingChar);
        } else {
            System.out.println("There is no non-repeating character in the text.");
        }

        // Close the Scanner object
        input.close();
    }
}
