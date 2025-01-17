import java.util.Scanner;

public class UnitConverter {

    // Method to convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        // Conversion factor from kilometers to miles
        double km2miles = 0.621371;
        // Convert km to miles
        double miles = km * km2miles;
        // Return the converted value
        return miles;
    }

    // Method to convert miles to kilometers and return the value
    public static double convertMilesToKm(double miles) {
        // Conversion factor from miles to kilometers
        double miles2km = 1.60934;
        // Convert miles to kilometers
        double km = miles * miles2km;
        // Return the converted value
        return km;
    }

    // Method to convert meters to feet and return the value
    public static double convertMetersToFeet(double meters) {
        // Conversion factor from meters to feet
        double meters2feet = 3.28084;
        // Convert meters to feet
        double feet = meters * meters2feet;
        // Return the converted value
        return feet;
    }

    // Method to convert feet to meters and return the value
    public static double convertFeetToMeters(double feet) {
        // Conversion factor from feet to meters
        double feet2meters = 0.3048;
        // Convert feet to meters
        double meters = feet * feet2meters;
        // Return the converted value
        return meters;
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take input for km
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();

        // Take input for miles
        System.out.print("Enter the distance in miles: ");
        double miles = input.nextDouble();

        // Take input for meters
        System.out.print("Enter the distance in meters: ");
        double meters = input.nextDouble();

        // Take input for feet
        System.out.print("Enter the distance in feet: ");
        double feet = input.nextDouble();

        // Call the conversion methods
        double miles2 = convertKmToMiles(km); 
        double km2 = convertMilesToKm(miles); 
        double feet2 = convertMetersToFeet(meters); 
        double meters2 = convertFeetToMeters(feet); 

        // Display the results
        System.out.println(km + " km is equal to " + miles2 + " miles");
        System.out.println(miles + " miles is equal to " + km2 + " km");
        System.out.println(meters + " meters is equal to " + feet2 + " feet");
        System.out.println(feet + " feet is equal to " + meters2 + " meters");

        input.close();
    }
}
