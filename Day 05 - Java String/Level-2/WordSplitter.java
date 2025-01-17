import java.util.Scanner;

public class WordSplitter {

    // Method to split the text into words using charAt()
    public static String[] splitTextIntoWords(String text) {
        // Initialize a variable to store the text length
        int textLength = findStringLength(text);
        // Initialize an array to store the words
        String[] words = new String[textLength];
        // Initialize a variable to store the current word and index
        String word = "";
        int index = 0;

        // Loop through the text to find words
        for (int i = 0; i < textLength; i++) {
            // Check if the current character is a space
            if (text.charAt(i) == ' ') {
                // If it's a space, add the current word to the array and reset the word
                if (!word.isEmpty()) {
                    words[index++] = word;
                    word = "";
                }
            } else {
                // If it's not a space, add the character to the current word
                word += text.charAt(i);
            }
        }
        // Add the last word
        if (!word.isEmpty()) {
            words[index++] = word;
        }

        // Trim the array to remove null values
        String[] result = new String[index];
        System.arraycopy(words, 0, result, 0, index);
        return result;
    }

    // Method to find the length of a string without using length() method
    public static int findStringLength(String text) {
        int length = 0;
        // Loop through the text to find the length
        for (char c : text.toCharArray()) {
            length++;
        }
        // Return the length
        return length;
    }

    // Method to create a 2D String array of words and their corresponding lengths
    public static String[][] getWordsAndLengths(String[] words) {
        // Initialize a 2D array to store the words and their lengths
        String[][] result = new String[words.length][2];
        // Loop through the words to store their lengths
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findStringLength(words[i]));
        }
        // Return the 2D array
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

        // Display the result in tabular format
        System.out.println("Word\tLength");
        for (int i = 0; i < words.length; i++) {
            System.out.println(wordsAndLengths[i][0] + "\t" + Integer.parseInt(wordsAndLengths[i][1]));
        }

        // Close the Scanner object
        input.close();
    }
}
