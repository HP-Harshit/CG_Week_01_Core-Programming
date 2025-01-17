import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        // Get user input
        int number = getNumberInput();

        // Call a method to find factorial
        int factorial = findFactorial(number);

        // Print the result
        displayResult(number, factorial);
    }

    // Method to get user input
    public static int getNumberInput() {
        // Create a scanner class object
        Scanner input = new Scanner(System.in);
        // Ask user for input
        System.out.print("Enter a number: ");
        // Get user input
        int number = input.nextInt();
        // Return the number
        return number;
    }

    // Method to find factorial using recursion
    public static int findFactorial(int number) {
        int factorial = 1;
        if (number == 0 || number == 1) {
            return factorial;
        }
        return number * findFactorial(number - 1);
    }

    // Method to display result
    public static void displayResult(int number, int factorial) {  
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
