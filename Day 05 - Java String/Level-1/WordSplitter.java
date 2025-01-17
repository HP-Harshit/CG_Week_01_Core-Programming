import java.util.Scanner;

public class WordSplitter {

    // Method to split the text into words using charAt()
    public static String[] splitTextIntoWords(String text) {
        // Initialize an empty array to store the words
        String[] words = new String[text.length()];
        // Initialize a empty string
        String word = "";
        // Initialize a index to keep track of the current word
        int index = 0;

        // Loop through the text
        for (int i = 0; i < text.length(); i++) {
            // Check if the current character is a space
            if (text.charAt(i) == ' ') {
                // If it is a space and string is not empty, add the current word to the array
                if (!word.equals("")) {
                    words[index++] = word;
                    // Reset the word
                    word = "";
                }
            } else {
                // If it is not a space, add the character to the word
                word += text.charAt(i);
            }
        }
        // Add the last word
        if (!word.equals("")) {
            words[index++] = word;
        }

        // Trim the array to remove null values
        String[] result = new String[index];
        // Copy the words to the result array
        for (int i = 0; i < index; i++) {
            result[i] = words[i];
        }
        // Return the result array
        return result;
    }

    // Method to find the length of a string without using length() method
    public static int findStringLength(String text) {
        // Initialize a counter to keep track of the length
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        // Return the length of the text
        return length;
    }

    // Method to create a 2D String array of words and their corresponding lengths
    public static String[][] getWordsAndLengths(String[] words) {
        // Initialize a 2D array to store the words and their lengths
        String[][] result = new String[words.length][2];
        // Loop through the words array
        for (int i = 0; i < words.length; i++) {
            // Add the word and its length to the result array
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findStringLength(words[i]));
        }
        // Return the result array
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
	    for(int i = 0; i<words.length; i++){
		    System.out.println(wordsAndLengths[i][0] + "\t" + Integer.parseInt(wordsAndLengths[i][1]));
    	}

        // Close the Scanner object
        input.close();
    }
}
