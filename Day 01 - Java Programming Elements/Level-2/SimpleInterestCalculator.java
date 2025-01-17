import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the principal amount
        System.out.print("Enter the Principal amount (INR): ");
        double principal = input.nextDouble();

        // Take user input for the rate of interest
        System.out.print("Enter the Rate of Interest (%): ");
        double rate = input.nextDouble();

        // Take user input for the time period
        System.out.print("Enter the Time period (years): ");
        double time = input.nextDouble();

        // Calculate the Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + 
                           ", Rate of Interest " + rate + "%, and Time " + time + " years.");

        // Close the scanner
        input.close();
    }
}
