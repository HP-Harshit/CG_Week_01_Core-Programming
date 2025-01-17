import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        // Create a Scanner object to take user input from the keyboard
        Scanner input = new Scanner(System.in);

        // Create a variable to indicate the distance in kilometers
        double km;

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble();

        // Convert the distance from kilometers to miles
        double miles = km / 1.6;

        // Print the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km.");

	input.close();
    }
}
