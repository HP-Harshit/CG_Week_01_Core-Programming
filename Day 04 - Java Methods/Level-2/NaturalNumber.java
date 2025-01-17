import java.util.Scanner;

public class NaturalNumber {

    // Recursive method to find the sum of natural numbers
    public static int sumNaturalNumber(int number) {
        // Base condition for recursion
        if (number == 1) {
            return 1;
        }
        return number + sumNaturalNumber(number - 1);
    }

    // Method to find the sum using the formula n*(n+1)/2
    public static int sumUsingFormula(int number) {
        return number * (number + 1) / 2;
    }

    // Main method
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for a number
        System.out.println("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("The input is not a natural number. Exiting program.");
            System.exit(0);
        } else {
            // Calculating the sum of natural numbers using the formula
            int sumFormula = sumUsingFormula(number);

            // Calculating the sum using the recursion method
            int sumRecursion = sumNaturalNumber(number);

            // Comparing the result of formula and recursion
            if (sumFormula == sumRecursion) {
                System.out.println("The result from both computations is correct.");
            } else {
                System.out.println("The result from both computations is different.");
            }
        }

        // Close the Scanner object
        input.close();
    }
}
