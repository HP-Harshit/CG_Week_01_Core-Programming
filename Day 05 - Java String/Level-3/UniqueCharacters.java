import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the text without using length() method
    public static int findLength(String text) {
        int length = 0;
        // Loop through each character in the text
        for (char c : text.toCharArray()) {
            length++;
        }
        // Return the length of the text
        return length;
    }

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String text) {
        // Create a variable to hold the length of the text
        int textLength = findLength(text);
        // Create a char array to hold the unique characters
        char[] tempArray = new char[textLength];
        int index = 0;

        // Loop to find the unique characters
        for (int i = 0; i < textLength; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Loop to check if the character is already in the array
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the array
            if (isUnique) {
                tempArray[index++] = currentChar;
            }
        }

        // Create an array to store the unique characters
        char[] uniqueCharacters = new char[index];
        System.arraycopy(tempArray, 0, uniqueCharacters, 0, index);
        // Return the array of unique characters
        return uniqueCharacters;
    }

    // Main method
    public static void main(String[] args) {
        
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for string
        System.out.println("Enter text: ");
        String text = input.nextLine();

        // Find unique characters using user-defined method
        char[] uniqueCharacters = findUniqueCharacters(text);

        // Display the result
        System.out.println("Unique characters in the text are: ");
        for (char ch : uniqueCharacters) {
            System.out.print(ch + " ");
        }

        // Close the Scanner object
        input.close();
    }
}
