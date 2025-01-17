import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the first double value (a)
        System.out.print("Enter the first double value (a): ");
        double a = input.nextDouble();

        // Take user input for the second double value (b)
        System.out.print("Enter the second double value (b): ");
        double b = input.nextDouble();

        // Take user input for the third double value (c)
        System.out.print("Enter the third double value (c): ");
        double c = input.nextDouble();

        // Calculate the double operations
        double operation1 = a + b * c;    // Multiplication has higher precedence than addition
        double operation2 = a * b + c;    // Multiplication has higher precedence than addition
        double operation3 = c + a / b;    // Division has higher precedence than addition
        double operation4 = a % b + c;    // Modulus has higher precedence than addition

        // Print the results
        System.out.println("The results of Double Operations are " + operation1 + ", " 
                           + operation2 + ", " + operation3 + ", and " + operation4);

        // Close the scanner
        input.close();
    }
}
