import java.util.Scanner;

public class SplitTextsToWords {

    // Method to calculate the length of the string without using length() method
    public static int calculateLength(String text) {
        // Initialize the length to zero
        int length = 0;
        // Loop through each character in the string
        for (char c : text.toCharArray()) {
            // Increment the length by one for each character
            length++;
        }
        // Return the calculated length
        return length;
    }

    // Method to split the text into words using charAt() without using split()
    public static String[] splitTextIntoWords(String text) {
        // Initialize a variable to hold text length
        int textLength = calculateLength(text);
        int wordCount = 1; // Start with 1 word

        // Count number of words
        for (int i = 0; i < textLength; i++) {
            // If the current character is a space, increment the word count
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create an array to store words
        String[] words = new String[wordCount];
        // Initialize an index to track the current word
        int wordIndex = 0;
        // Initialize a variable to hold the current word
        String word = "";

        // Extract words
        for (int i = 0; i < textLength; i++) {
            char c = text.charAt(i);
            // If the current character is a space
            if (c == ' ') {
                // Check if the word is not empty, add the current word to the array and reset the word
                if (!word.isEmpty()) {
                    words[wordIndex++] = word;
                    word = "";
                }
            } else {
                word += c;
            }
        }
        // Add the last word
        if (!word.isEmpty()) {
            words[wordIndex] = word;
        }

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        // Check if both arrays have the same length
        if (array1.length != array2.length) {
            // If not, return false
            return false;
        }
        // Iterate over the arrays
        for (int i = 0; i < array1.length; i++) {
            // If the current elements are not equal, return false
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        // If no differences were found, return true
        return true;
    }

    // Main method
    public static void main(String[] args) {

        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for text
        System.out.println("Enter the text:");
        String text = input.nextLine();

        // Split text into words using user-defined method
        String[] wordsUserDefined = splitTextIntoWords(text);

        // Split text into words using built-in method
        String[] wordsBuiltIn = text.split(" ");

        // Compare the results
        boolean areResultsSame = compareStringArrays(wordsUserDefined, wordsBuiltIn);

        // Display the results
        System.out.println("The words using user-defined method are:");
        for (String word : wordsUserDefined) {
            System.out.print(word + " ");
        }
        System.out.println("\nThe words using built-in method are:");
        for (String word : wordsBuiltIn) {
            System.out.print(word + " ");
        }
        System.out.println("\nBoth results are " + (areResultsSame ? "same." : "not the same."));

        // Close the Scanner object
        input.close();
    }
}
