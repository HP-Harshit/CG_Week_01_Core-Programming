import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String text) {
        // Initialize the length variable
        int textLength = text.length();
        // Create a character array to store unique characters
        char[] tempArray = new char[textLength];
        // Initialize the count variable
        int index = 0;

        // Loop to find the unique characters
        for (int i = 0; i < textLength; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character is already in the tempArray
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // If the current character is unique, add it to the tempArray
            if (isUnique) {
                tempArray[index++] = currentChar;
            }
        }

        // Create an array to store the unique characters
        char[] uniqueCharacters = new char[index];
        // Copy the unique characters from the tempArray to the uniqueCharacters array
        System.arraycopy(tempArray, 0, uniqueCharacters, 0, index);
        return uniqueCharacters;
    }

    // Method to find the frequency of characters in a string and return the
    // characters and their frequencies in a 2D array
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of characters

        // Loop through the text to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            frequency[c]++;
        }

        // Call the uniqueCharacters() method to find the unique characters in the text
        char[] uniqueCharacters = findUniqueCharacters(text);

        // Create a 2D array to store the unique characters and their frequencies
        String[][] result = new String[uniqueCharacters.length][2];
        for (int i = 0; i < uniqueCharacters.length; i++) {
            char uniqueChar = uniqueCharacters[i];
            result[i][0] = Character.toString(uniqueChar);
            result[i][1] = Integer.toString(frequency[uniqueChar]);
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for string
        System.out.println("Enter text: ");
        String text = input.nextLine();

        // Find the frequency of unique characters using user-defined method
        String[][] characterFrequency = findCharacterFrequency(text);

        // Display the result
        System.out.println("Character\tFrequency");
        for (int i = 0; i < characterFrequency.length; i++) {
            System.out.println(characterFrequency[i][0] + "\t\t" + characterFrequency[i][1]);
        }

        // Close the Scanner object
        input.close();
    }
}
