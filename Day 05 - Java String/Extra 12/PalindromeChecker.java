import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        // Call a method to take input for string
        System.out.println("Enter a string: ");
        String str = getString();

        // Call a method to check if the string is a palindrome
        System.out.println("Is the string a palindrome? " + isPalindrome(str));
    }

    // Method to get string from user
    public static String getString() {
        // Create a scanner class object
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to ignore case sensitivity
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
