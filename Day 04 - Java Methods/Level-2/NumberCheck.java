import java.util.Scanner;

public class NumberCheck {

    // Method to check whether the number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether the number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers and return 1 if number1 > number2, 0 if both are equal, or -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to store 5 numbers
        int[] numbers = new int[5];

        // Take user input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Loop through the array and check if the number is positive or negative, if positive check if it's even or odd, and print accordingly
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println("Number " + (i + 1) + " (" + numbers[i] + ") is positive and even.");
                } else {
                    System.out.println("Number " + (i + 1) + " (" + numbers[i] + ") is positive and odd.");
                }
            } else {
                System.out.println("Number " + (i + 1) + " (" + numbers[i] + ") is negative.");
            }
        }

        // Compare the first and last elements of the array and display the result
        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("The first element (" + numbers[0] + ") is greater than the last element (" + numbers[4] + ").");
        } else if (comparisonResult == 0) {
            System.out.println("The first element (" + numbers[0] + ") is equal to the last element (" + numbers[4] + ").");
        } else {
            System.out.println("The first element (" + numbers[0] + ") is less than the last element (" + numbers[4] + ").");
        }

        // Close the Scanner object
        input.close();
    }
}
