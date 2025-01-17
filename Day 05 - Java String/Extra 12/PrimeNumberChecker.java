import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {

        // Create a scanner class object
        Scanner input = new Scanner(System.in);

        // Ask user input for a number
        System.out.println("Enter a Number: ");
        int number = input.nextInt();

        // Call a method to check if the number is prime
        boolean isPrime = checkPrime(number);

        // Print the result
        displayResult(isPrime, number);

        // close scanner class object
        input.close();
    }

    // Method to check prime
    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to display result
    public static void displayResult(boolean isPrime, int number) {
        System.out.println(number + " is a " + (isPrime ? "Prime" : "Not Prime") + " Number");
    }
}