import java.util.Scanner;

public class TriangularPark {

    // Method to compute the number of rounds
    double roundsCalculator(double perimeter) {
        // Calculate the total number of rounds and return the result
        return 5000 / perimeter; // 5km = 5000 meters
    }

    // Main method
    public static void main(String[] args) {
        // Create a main class object to call methods
        TriangularPark classObject = new TriangularPark();

        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for three sides
        System.out.println("Enter side 1 (in meters): ");
        double side1 = input.nextDouble();
        System.out.println("Enter side 2 (in meters): ");
        double side2 = input.nextDouble();
        System.out.println("Enter side 3 (in meters): ");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Calculate the number of rounds
        double numberOfRounds = classObject.roundsCalculator(perimeter);

        // Display the result
        System.out.println("The athlete will need to complete " + numberOfRounds + " rounds.");

        // Close the Scanner object
        input.close();
    }
}
