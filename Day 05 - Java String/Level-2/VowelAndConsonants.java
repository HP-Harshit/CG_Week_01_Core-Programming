import java.util.Scanner;

public class VowelAndConsonants {

    // Method to check if the character is a vowel or consonant
    public static int isVowelConsonant(char ch) {
        char c = ch;
        if (c >= 'A' && c <= 'Z') {
            c = (char) (ch + 32); // Convert to lowercase if it's uppercase 
        }
        // Check if the character is a vowel or consonant
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return 0; // Vowel
        } else if (c >= 'a' && c <= 'z') {
            return 1; // Consonant
        }
        return -1; // Not a letter
    }

    // Method to find vowels and consonants in a string using charAt() method
    public static int[] findVowelConsonant(String text) {
        int[] vowelConsonantCount = new int[2];
        for (int i = 0; i < text.length(); i++) {
            int res = isVowelConsonant(text.charAt(i));
            if (res == 0) {
                vowelConsonantCount[0]++; // Vowel count
            } else if (res == 1) {
                vowelConsonantCount[1]++; // Consonant count
            }
        }
        // Return the count of vowels and consonants
        return vowelConsonantCount;
    }

    // Main method
    public static void main(String[] args) {

        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter the text: ");
        String text = input.nextLine().trim();

        // Call a method to find vowels and consonants
        int[] vowelConsonant = findVowelConsonant(text);

        // Displaying the detail
        System.out.println("The number of vowels and consonants in the text \"" + text + "\" are: " +
                vowelConsonant[0] + " vowels and " + vowelConsonant[1] + " consonants.");

        // Close the Scanner object
        input.close();
    }
}
