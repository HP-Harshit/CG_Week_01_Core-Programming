import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        // Initialize the count variable
        int count = 0;
        // Loop to count the digits
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        // Get the number of digits in the number
        int length = countDigits(number);
        // Create an array to store the digits
        int[] digits = new int[length];
        // Loop to populate the digits array
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        // Create a new array to store reversed digits
        int[] reversed = new int[digits.length];
        // Loop to populate the reversed array
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean arraysEqual(int[] array1, int[] array2) {
        // Use Arrays.equals to compare the arrays
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        // Get the digits array
        int[] digits = getDigitsArray(number);
        // Get the reversed digits array
        int[] reversedDigits = reverseArray(digits);
        // Check if the original and reversed arrays are equal
        return Arrays.equals(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        // Loop to check for a zero digit, starting from the second position
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find the count of digits
        int digitCount = countDigits(number);

        // Store the digits in an array
        int[] digits = getDigitsArray(number);

        // Reverse the digits array
        int[] reversedDigits = reverseArray(digits);

        // Check if the number is a palindrome
        boolean isPalindrome = isPalindrome(number);

        // Check if the number is a duck number
        boolean isDuck = isDuckNumber(digits);

        // Compare the original and reversed arrays
        boolean arraysAreEqual = arraysEqual(digits, reversedDigits);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Count of digits: " + digitCount);
        System.out.print("Digits array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.print("\nReversed digits array: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println("\nAre the original and reversed arrays equal: " + arraysAreEqual);
        System.out.println("Is Palindrome: " + isPalindrome);
        System.out.println("Is Duck Number: " + isDuck);

        // Close the Scanner object
        input.close();
    }
}
