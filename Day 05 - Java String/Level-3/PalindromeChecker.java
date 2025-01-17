import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Method to compare characters from start and end to check if text is palindrome
    public static boolean isPalindromeIterative(String text) {
        // Initialize start and end point
        int start = 0;
        int end = text.length() - 1;

        // Loop until start pointer is less than end pointer
        while (start < end) {
            // If characters at start and end are not equal, return false
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            // Move start pointer forward and end pointer backward
            start++;
            end--;
        }

        // If loop completes without finding any mismatch, return true
        return true;
    }

    // Logic 2: Recursive method to compare characters from start and end to check if text is palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case
        if (start >= end) {
            return true;
        }

        // If characters at the start and end indexes are not equal, return false
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursively call the method with start index incremented and end index decremented
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Method to reverse a string and compare it with the original string to check if palindrome
    public static boolean isPalindromeUsingArray(String text) {
        // Convert the string into a character array
        char[] originalArray = text.toCharArray();
        // Initialize an empty array to store the reversed string
        char[] reversedArray = new char[text.length()];

        // Reverse the string using charAt()
        for (int i = 0; i < text.length(); i++) {
            reversedArray[i] = text.charAt(text.length() - 1 - i);
        }

        // Compare original and reversed arrays
        for (int i = 0; i < text.length(); i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }

        // If loop completes without finding any mismatch, return true
        return true;
    }

    // Main method
    public static void main(String[] args) {
        
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for string
        System.out.println("Enter text: ");
        String text = input.nextLine();

        // Check if text is palindrome using three different logics
        boolean isPalindromeIterative = isPalindromeIterative(text);
        boolean isPalindromeRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean isPalindromeUsingArray = isPalindromeUsingArray(text);

        // Display the results
        System.out.println("Palindrome check using iterative method: " + (isPalindromeIterative ? "Yes" : "No"));
        System.out.println("Palindrome check using recursive method: " + (isPalindromeRecursive ? "Yes" : "No"));
        System.out.println("Palindrome check using character array method: " + (isPalindromeUsingArray ? "Yes" : "No"));

        // Close the Scanner object
        input.close();
    }
}
