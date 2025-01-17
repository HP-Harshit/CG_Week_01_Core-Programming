import java.util.Scanner;

public class SmallestLargest {

    // Static method to find the smallest and largest number
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        // Create an array to hold the smallest and largest numbers
        int[] number = new int[2];
        
        number[0] = Math.min(number1, Math.min(number2, number3));
        number[1] = Math.max(number1, Math.max(number2, number3));

        // Return the result
        return number;
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
        System.out.println("Enter the third number: ");
        int thirdNum = input.nextInt();

        // Create an array to store the result 
        int[] result = SmallestLargest.findSmallestAndLargest(firstNum, secondNum, thirdNum);

        // Display the result
        System.out.println("The smallest number is " + result[0] + " and the largest number is " + result[1]);

        // Close the Scanner object
        input.close();
    }
}
