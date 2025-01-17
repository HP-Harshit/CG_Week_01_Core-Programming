import java.util.Scanner;

public class ChocolateDistribution {

    // Static method to find the number of chocolates each child gets and the remainder
    public static int[] findNumberOfChocolates(int chocolates, int children) {
        // Create an array to store the quotient and remainder
        int[] result = new int[2];

        result[0] = chocolates / children;
        result[1] = chocolates % children;

        // Return the result
        return result;
    }

    // Main method
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for the total number of chocolates and children
        System.out.println("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        System.out.println("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Create an array to store the result
        int[] result = ChocolateDistribution.findNumberOfChocolates(numberOfChocolates, numberOfChildren);

        // Display the result
        System.out.println("Each child will get " + result[0] + " chocolates, and the remaining chocolates are " + result[1]);

        // Close the Scanner object
        input.close();
    }
}
