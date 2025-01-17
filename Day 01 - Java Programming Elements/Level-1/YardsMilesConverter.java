import java.util.Scanner;

public class YardsMilesConverter {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert distance to yards
        double distanceInYards = distanceInFeet / 3.0;

        // Convert distance to miles
        double distanceInMiles = distanceInYards / 1760.0;

        // Print the results
        System.out.println("The distance in feet is " + distanceInFeet +
                           " which is equivalent to " + distanceInYards + 
                           " yards and " + distanceInMiles + " miles.");
        
        // Close the scanner
        input.close();
    }
}

