import java.util.Scanner;

public class QuotientRemainder {

    // Static method to find the quotient and remainder of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Create an array to store the quotient and remainder
        int[] result = new int[2];

        result[0] = number / divisor;
        result[1] = number % divisor;

        // Return the result
        return result;
    }

    // Main method
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for numbers
        System.out.println("Enter the first number: ");
        int firstNum = input.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = input.nextInt();

        // Create an array to store the result
        int[] result = QuotientRemainder.findRemainderAndQuotient(firstNum, secondNum);

        // Display the result
        System.out.println("The Quotient is: " + result[0] + " and the Remainder is: " + result[1]);

        // Close the Scanner object
        input.close();
    }
}
