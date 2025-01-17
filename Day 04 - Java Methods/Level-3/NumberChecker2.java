import java.util.Scanner;

public class NumberChecker2 {

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

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        // Initialize the sum variable
        int sum = 0;
        // Loop to calculate the sum of the digits
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int[] digits) {
        // Initialize the sum variable
        int sum = 0;
        // Loop to calculate the sum of the squares of the digits
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        // Get the digits of the number
        int[] digits = getDigitsArray(number);
        // Find the sum of the digits
        int sum = sumOfDigits(digits);
        // Check if the number is divisible by the sum of its digits
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        // Create a 2D array to store the frequency with digit in the first column and frequency in the second column
        int[][] frequency = new int[10][2];
        // Initialize the digit values in the first column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        // Loop to calculate the frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
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

        // Find the sum of the digits
        int sumDigits = sumOfDigits(digits);

        // Find the sum of the squares of the digits
        int sumSquaresDigits = sumOfSquaresOfDigits(digits);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number);

        // Find the frequency of each digit
        int[][] digitFreq = digitFrequency(digits);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Count of digits: " + digitCount);
        System.out.print("Digits array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println("\nSum of digits: " + sumDigits);
        System.out.println("Sum of the squares of the digits: " + sumSquaresDigits);
        System.out.println("Is Harshad Number: " + isHarshad);

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + digitFreq[i][0] + ": " + digitFreq[i][1]);
        }

        // Close the Scanner object
        input.close();
    }
}
