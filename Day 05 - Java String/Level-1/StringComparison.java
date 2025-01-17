import java.util.Scanner;

public class StringComparison {

    // Method to compare strings using charAt() method
    public static boolean stringUsingCharAt(String text1, String text2) {
        // Check if both strings have the same length
        if (text1.length() != text2.length()) {
            return false; // Strings of different lengths can't be equal
        }
        // Compare characters at the same position in both strings
        for (int i = 0; i < text1.length(); i++) {
            // If characters at the same position are different, return false
            if (text1.charAt(i) != text2.charAt(i)) {
                // Strings are not equal
                return false;
            }
        }
        // Return true if all characters match
        return true;
    }

    // Method to compare strings using equals() method
    public static boolean stringUsingEquals(String text1, String text2) {
        // Compare strings using equals() method
        return text1.equals(text2);
    }

    // Main method
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for string1 and string2
        System.out.println("Enter text 1: ");
        String text1 = input.next();
        System.out.println("Enter text 2: ");
        String text2 = input.next();

        // Calling methods to compare strings
        boolean isSame = stringUsingCharAt(text1, text2);
        boolean isEqual = stringUsingEquals(text1, text2);

        // Display the result
	    System.out.println("Comparison using charAt() method: " + (isSame ? "Equal" : "Not Equal"));
	    System.out.println("Comparison using equals() method: " + (isEqual ? "Equal" : "Not Equal"));
        if (isSame == isEqual) {
            System.out.println("Both results are the same.");
        } else {
            System.out.println("Both results are not the same.");
        }

        // Close the Scanner object
        input.close();
    }
}
