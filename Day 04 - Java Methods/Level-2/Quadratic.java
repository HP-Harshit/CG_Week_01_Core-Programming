import java.util.Scanner;

public class Quadratic {

    // Method to calculate delta
    public static double calculateDelta(double a, double b, double c) {
        // Calculate delta
        return Math.pow(b, 2) - (4 * a * c);
    }

    // Method to calculate roots
    public static double[] calculateRoots(double delta, double a, double b) {
        // Check for delta and calculate roots
        if (delta > 0) {
            double[] roots = new double[2];
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
            return roots;
        } else if (delta == 0) {
            double[] roots = new double[1];
            roots[0] = -b / (2 * a);
            return roots;
        } else {
            // Return an empty array if delta is negative
            return new double[0];
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for a, b, and c
        System.out.print("Enter value for a: ");
        double a = input.nextDouble();
        System.out.print("Enter value for b: ");
        double b = input.nextDouble();
        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        // Calculate delta
        double delta = calculateDelta(a, b, c);

        // Calculate the roots
        double[] roots = calculateRoots(delta, a, b);

        // Display the result
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one root: " + roots[0]);
        } else {
            System.out.println("The equation has two roots: " + roots[0] + " and " + roots[1]);
        }

        // Close the Scanner object
        input.close();
    }
}
