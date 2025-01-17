import java.util.Scanner;

public class NaturalNumber {

    // Method to sum natural numbers
    int sumNaturalNumber(int number) {
        int temp = number, sum = 0;
        // Calculating the sum using loop
        while (temp > 0) {
            sum += temp;
            temp--;
        }
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        // Create a main class object to call methods
        NaturalNumber classObject = new NaturalNumber();

        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for number
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Create a variable to store the sum of the N natural numbers
        int sum = classObject.sumNaturalNumber(number);

        // Displaying the result
        System.out.println("The sum of the first " + number + " natural numbers is: " + sum);

        // Close the Scanner object
        input.close();
    }
}
