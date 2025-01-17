import java.util.Scanner;

public class SplitWords {

    // Method to find the length of a string without using length() method
    public static int findStringLength(String text) {
        int length = 0;
        // Loop through each character in the string
        for (char c : text.toCharArray()) {
            // Increment the length for each character
            length++;
        }
        // Return the length of the string
        return length;
    }

    // Method to split the text into words using charAt() without using split()
    public static String[] splitTextIntoWords(String text) {
        // Initialize a variable to hold the text length
        int textLength = findStringLength(text);
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
        int wordIndex = 0;
        String word = "";

        // Extract words
        for (int i = 0; i < textLength; i++) {
            char c = text.charAt(i);
            // Check if the character is space
            if (c == ' ') {
                // If the word is not empty, add it to the array
                if (!word.isEmpty()) {
                    words[wordIndex++] = word;
                    word = "";
                }
            } else {
                // Add the character to the word
                word += c;
            }
        }
        // Add the last word
        if (!word.isEmpty()) {
            words[wordIndex] = word;
        }

        // Return the array of words
        return words;
    }

    // Method to create a 2D String array of words and their corresponding lengths
    public static String[][] getWordsAndLengths(String[] words) {
        // Initialize a 2D array to store words and their lengths
        String[][] result = new String[words.length][2];
        // Iterate the array, and save the word and length
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findStringLength(words[i]));
        }
        // Return the 2D array
        return result;
    }

    // Method to take 2D array and find longest and shortest length string
    public static String[] shortestAndLongestString(String[][] wordsAndLengths) {
        // Initialize variables to store the shortest and longest strings
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        String[] result = new String[2];
        // Iterate the array to find the shortest and longest strings
        for (String[] wordAndLength : wordsAndLengths) {
            // Update the minimum and maximum values
            int length = Integer.parseInt(wordAndLength[1]);
            if (length > max) {
                max = length;
                result[1] = wordAndLength[0]; // Longest string
            }
            if (length < min) {
                min = length;
                result[0] = wordAndLength[0]; // Shortest string
            }
        }
        // Return the array of shortest and longest strings
        return result;
    }

    // Main method
    public static void main(String[] args) {
        
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for text
        System.out.println("Enter text: ");
        String text = input.nextLine();

        // Split text into words using user-defined method
        String[] words = splitTextIntoWords(text);

        // Create a 2D array of words and their lengths
        String[][] wordsAndLengths = getWordsAndLengths(words);

        // Call a method to find the shortest and longest string
        String[] shortAndLong = shortestAndLongestString(wordsAndLengths);

        // Display the shortest and longest strings
        System.out.println("The shortest string is \"" + shortAndLong[0] + "\"");
        System.out.println("The longest string is \"" + shortAndLong[1] + "\"");

        // Close the Scanner object
        input.close();
    }
}
