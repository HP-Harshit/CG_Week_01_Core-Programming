import java.util.Scanner;

public class VowelAndConsonantChecker {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        char c = ch;
        if (c >= 'A' && c <= 'Z') { 
            c = (char) (ch + 32); // Convert to lowercase if it's uppercase
        }
        // Check if the character is a vowel or consonant
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        } else if (c >= 'a' && c <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string using charAt() method
    public static String[][] findVowelsAndConsonants(String text) {
        // Initialize 2D array to store vowels and consonants
        String[][] result = new String[text.length()][2];
        // Iterate over each character in the string
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Check the type of character and store it in the 2D array
            result[i][0] = String.valueOf(c);
            result[i][1] = checkCharacterType(c);
        }
        // Return the 2D array
        return result;
    }

    // Method to display the 2D Array of Strings in a Tabular Format
    public static void displayInTabularFormat(String[][] vowelAndConsonant) {
        System.out.println("Character\tType");
        for (String[] pair : vowelAndConsonant) {
            System.out.println(pair[0] + "\t\t" + pair[1]);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter the text: ");
        String text = input.nextLine().trim();

        // Call a method to find vowels and consonants
        String[][] vowelConsonantArray = findVowelsAndConsonants(text);

        // Display the detail in tabular format
        displayInTabularFormat(vowelConsonantArray);

        // Close the Scanner object
        input.close();
    }
}
