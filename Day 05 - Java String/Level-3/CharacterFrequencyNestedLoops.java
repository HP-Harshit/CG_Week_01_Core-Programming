import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        // Convert the string to a char array
        char[] characters = text.toCharArray(); 
        // Array to store the frequency of each character
        int[] frequency = new int[characters.length]; 

        // Loop through the characters to find the frequency of each character
        for (int i = 0; i < characters.length; i++) {
            // Check if the character is already counted
            if (characters[i] != '0') { 
                frequency[i] = 1; // Initialize the frequency of the character to 1

                // Loop through the remaining characters to find the frequency of the character
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        // Increment the frequency of the character
                        frequency[i]++;
                        // Set duplicate characters to '0'
                        characters[j] = '0'; 
                    }
                }
            }
        }

        // Count the number of unique characters
        int uniqueCharCount = 0;
        // Loop through the frequency array to count the number of unique characters
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                // Increment the count of unique characters
                uniqueCharCount++;
            }
        }

        // Create a 1D String array to store the characters and their frequencies
        String[] result = new String[uniqueCharCount];
        int index = 0;
        // Loop through the frequency array to store the characters and their frequencies in the result array
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + ": " + frequency[i];
                index++;
            }
        }

        // Return the result array
        return result;
    }

    // Main method
    public static void main(String[] args) {
        
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for string
        System.out.println("Enter text: ");
        String text = input.nextLine();

        // Find the frequency of characters using user-defined method
        String[] characterFrequency = findCharacterFrequency(text);

        // Display the result
        System.out.println("Character Frequencies:");
        for (String freq : characterFrequency) {
            System.out.println(freq);
        }

        // Close the Scanner object
        input.close();
    }
}
