import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if the lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store the frequency of characters in the strings
        int[] frequency1 = new int[256]; // ASCII characters
        int[] frequency2 = new int[256]; // ASCII characters

        // Find the frequency of characters in the two texts using loops
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequency of characters in the two texts
        for (int i = 0; i < 256; i++) {
            // If the frequency of a character is different in the two texts, return false
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        // If the frequency of characters is the same in the two texts, return true
        return true;
    }

    // Main method
    public static void main(String[] args) {
        
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for the two strings
        System.out.println("Enter the first text: ");
        String text1 = input.nextLine();
        System.out.println("Enter the second text: ");
        String text2 = input.nextLine();

        // Check if the two texts are anagrams using the user-defined method
        boolean isAnagram = areAnagrams(text1, text2);

        // Display the result
        if (isAnagram) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        // Close the Scanner object
        input.close();
    }
}
