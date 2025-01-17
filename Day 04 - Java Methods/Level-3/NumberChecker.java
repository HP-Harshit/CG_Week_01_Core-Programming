import java.util.Scanner;

public class NumberChecker {

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

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        // Get the number of digits in the number
        int length = countDigits(number);
        // Initialize the sum variable
        int sum = 0, temp = number;
        // Loop to calculate the sum of digits raised to the power of the number of digits
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        // Initialize variables to store the largest and second largest elements
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        // Loop to find the largest and second largest elements
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        // Initialize variables to store the smallest and second smallest elements
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        // Loop to find the smallest and second smallest elements
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
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

        // Check if the number is a duck number
        boolean isDuck = isDuckNumber(digits);

        // Check if the number is an Armstrong number
        boolean isArmstrong = isArmstrongNumber(number);

        // Find the largest and second largest elements in the digits array
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);

        // Find the smallest and second smallest elements in the digits array
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Count of digits: " + digitCount);
        System.out.print("Digits array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println("\nIs Duck Number: " + isDuck);
        System.out.println("Is Armstrong Number: " + isArmstrong);
        System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        System.out.println("Second largest digit: " + largestAndSecondLargest[1]);
        System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);

        // Close the Scanner object
        input.close();
    }
}
