import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args) {

        // Create a Scanner class object
        Scanner input = new Scanner(System.in);

        // Ask user input for num1 and num2
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        // Call a method to calculate GCD of two numbers
        int gcd = FindGcd(num1, num2);

        // Call a method to find LCm of two numbers
        int lcm = FindLcm(num1, num2);

        // Print the results
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);

        // Close the Scanner object
        input.close();
    }

    // Method to calculate GCD
    public static int FindGcd(int num1, int num2) {
        // Base case
        if (num2 == 0) {
            return num1;
        }
        // Recursive case
        return FindGcd(num2, num1 % num2);
    }

    // Method to calculate LCM
    public static int FindLcm(int num1, int num2) {
        // Calculate LCM using the formula: LCM(a, b) = (a * b)/gcd(a,b)
        return (num1 * num2) / FindGcd(num1, num2);
    }
}
