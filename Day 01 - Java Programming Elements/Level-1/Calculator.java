import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for number 1
        System.out.print("Enter your Number 1: ");
        double num1 = input.nextDouble();

        // Take user input for number 2
        System.out.print("Enter your Number 2: ");
        double num2 = input.nextDouble();

        // Create variables to indicate the results of arithmetic operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;

        // Print the results
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
                           + num1 + " and " + num2 + " is " 
                           + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        // Close the input
        input.close();
    }
}
