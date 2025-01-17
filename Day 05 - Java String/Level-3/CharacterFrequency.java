import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string using charAt()
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of characters

        // Loop through the text to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Increment the frequency of the character
            frequency[c]++;
        }

        // Count the number of unique characters
        int uniqueCharCount = 0;
        for (int i = 0; i < 256; i++) {
            // If the frequency of the character is greater than 0, it's a unique character
            if (frequency[i] > 0) {
                uniqueCharCount++;
            }
        }

        // Create a 2D array to store the characters and their frequencies
        String[][] result = new String[uniqueCharCount][2];
        int index = 0;
        // Loop through the frequency array to populate the 2D array
        for (int i = 0; i < 256; i++) {
            // If the frequency of the character is greater than 0, add it to the 2D array
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(frequency[i]);
                index++;
            }
        }

        // Return the 2D array
        return result;
    }

    // Method to display the result in a tabular format
    public static void displayResults(String[][] result) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for string
        System.out.println("Enter text: ");
        String text = input.nextLine();

        // Find the frequency of characters using user-defined method
        String[][] characterFrequency = findCharacterFrequency(text);

        // Display the result
        displayResults(characterFrequency);

        // Close the Scanner object
        input.close();
    }
}
