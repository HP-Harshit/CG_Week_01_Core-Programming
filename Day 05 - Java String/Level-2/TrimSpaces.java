import java.util.Scanner;

public class TrimSpaces {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end + 1 }; // end + 1 to include the last character
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        // Create an empty string
        String substring = "";
        // Iterate from start to end 
        for (int i = start; i < end; i++) {
            // Add the character at index i to the substring
            substring += text.charAt(i);
        }
        // Return the substring
        return substring;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        // Check if both strings have the same length
        if (str1.length() != str2.length()) {
            return false; // Strings are not equal
        }
        // Iterate over the characters in the strings
        for (int i = 0; i < str1.length(); i++) {
            // If characters at index i are not equal, return false
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        // If all characters match, return true
        return true;
    }

    // Main method
    public static void main(String[] args) {

        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for text
        System.out.println("Enter text: ");
        String text = input.nextLine();

        // Trim spaces using user-defined method
        int[] trimIndices = findTrimIndices(text);
        String userTrimmedText = createSubstring(text, trimIndices[0], trimIndices[1]);

        // Trim spaces using built-in trim() method
        String builtInTrimmedText = text.trim();

        // Compare the two strings
        boolean areEqual = compareStrings(userTrimmedText, builtInTrimmedText);

        // Display the results
        System.out.println("Text after user-defined trimming: \"" + userTrimmedText + "\"");
        System.out.println("Text after built-in trimming: \"" + builtInTrimmedText + "\"");
        System.out.println("Are both trimmed texts equal? " + areEqual);

        // Close the Scanner object
        input.close();
    }
}
