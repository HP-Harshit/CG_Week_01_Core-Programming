import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the base of the triangle in centimeters
        System.out.print("Enter the base of the triangle (cm): ");
        double baseCm = input.nextDouble();

        // Take user input for the height of the triangle in centimeters
        System.out.print("Enter the height of the triangle (cm): ");
        double heightCm = input.nextDouble();

        // Calculate the area of the triangle in square centimeters
        double areaCm2 = 0.5 * baseCm * heightCm;

        // Convert the base and height from centimeters to inches
        double baseInches = baseCm / 2.54;
        double heightInches = heightCm / 2.54;

        // Calculate the area of the triangle in square inches
        double areaInches2 = 0.5 * baseInches * heightInches;

        // Print the results
        System.out.println("The area of the triangle is " + areaCm2 + 
                           " square centimeters and " + areaInches2 + " square inches.");
        
        // Close the scanner
        input.close();
    }
}
