import java.util.Scanner;

public class TrigonometricFunctions {

    // Static method to calculate various trigonometric functions
    public double[] calculateTrigonometricFunctions(double angle) {
        // Converting angle to radians
        double angleInRadians = Math.toRadians(angle);

        // Calculating the trigonometric functions
        double[] trigonometry = new double[3];

        trigonometry[0] = Math.sin(angleInRadians); // trigonometry[0] for sin
        trigonometry[1] = Math.cos(angleInRadians); // trigonometry[1] for cos
        trigonometry[2] = Math.tan(angleInRadians); // trigonometry[2] for tan

        // Return the result
        return trigonometry;
    }

    // Main method
    public static void main(String[] args) {
        // Create a main class object
        TrigonometricFunctions classObject = new TrigonometricFunctions();

        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for angle
        System.out.println("Enter the angle (in degrees): ");
        double angle = input.nextDouble();

        // Create an array to store the result of trigonometric functions
        double[] result = classObject.calculateTrigonometricFunctions(angle);

        // Displaying the result
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);

        // Close the Scanner object
        input.close();
    }
}
