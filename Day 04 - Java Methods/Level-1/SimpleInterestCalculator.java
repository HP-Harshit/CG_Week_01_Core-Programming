import java.util.Scanner;

public class SimpleInterestCalculator {

    // A method to calculate the simple interest
    double calculateSI(double principal, double rateOfInterest, double time) {
        // Calculating the Simple Interest and returning the result
        return (principal * rateOfInterest * time) / 100;
    }

    // Main method
    public static void main(String[] args) {
        // Create a main class object to call methods
        SimpleInterestCalculator si = new SimpleInterestCalculator();

        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for principal, rate of interest and time
        System.out.println("Enter the Principal (INR): ");
        double principal = input.nextDouble();
        System.out.println("Enter the Rate of Interest (%): ");
        double rateOfInterest = input.nextDouble();
        System.out.println("Enter the Time (Years): ");
        double time = input.nextDouble();

        // Create a variable for simple interest and calling a method to calculate the result and store it
        double simpleInterest = si.calculateSI(principal, rateOfInterest, time);

        // Displaying the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rateOfInterest + " and Time " + time);

        // Close the scanner object
        input.close();
    }
}
