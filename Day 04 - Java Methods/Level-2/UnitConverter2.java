import java.util.Scanner;

public class UnitConverter2 {

    // Method to convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        // Conversion factor from kilometers to miles
        double km2miles = 0.621371;
        // Convert kilometers to miles
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

    // Method to convert yards to feet and return the value
    public static double convertYardsToFeet(double yards) {
        // Conversion factor from yards to feet
        double yards2feet = 3.0;
        // Convert yards to feet
        double feet = yards * yards2feet;
        // Return the converted value
        return feet;
    }

    // Method to convert feet to yards and return the value
    public static double convertFeetToYards(double feet) {
        // Conversion factor from feet to yards
        double feet2yards = 0.333333;
        // Convert feet to yards
        double yards = feet * feet2yards;
        // Return the converted value
        return yards;
    }

    // Method to convert meters to inches and return the value
    public static double convertMetersToInches(double meters) {
        // Conversion factor from meters to inches
        double meters2inches = 39.3701;
        // Convert meters to inches
        double inches = meters * meters2inches;
        // Return the converted value
        return inches;
    }

    // Method to convert inches to meters and return the value
    public static double convertInchesToMeters(double inches) {
        // Conversion factor from inches to meters
        double inches2meters = 0.0254;
        // Convert inches to meters
        double meters = inches * inches2meters;
        // Return the converted value
        return meters;
    }

    // Method to convert inches to centimeters and return the value
    public static double convertInchesToCm(double inches) {
        // Conversion factor from inches to centimeters
        double inches2cm = 2.54;
        // Convert inches to centimeters
        double cm = inches * inches2cm;
        // Return the converted value
        return cm;
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

        // Take input for yards
        System.out.print("Enter the distance in yards: ");
        double yards = input.nextDouble();

        // Take input for inches
        System.out.print("Enter the distance in inches: ");
        double inches = input.nextDouble();

        // Call the conversion methods
        double miles2 = convertKmToMiles(km); 
        double km2 = convertMilesToKm(miles); 
        double feet2 = convertMetersToFeet(meters); 
        double meters2 = convertFeetToMeters(feet); 
        double feetFromYards = convertYardsToFeet(yards);
        double yardsFromFeet = convertFeetToYards(feet);
        double inchesFromMeters = convertMetersToInches(meters);
        double metersFromInches = convertInchesToMeters(inches);
        double cmFromInches = convertInchesToCm(inches);

        // Display the results
        System.out.println(km + " km is equal to " + miles2 + " miles");
        System.out.println(miles + " miles is equal to " + km2 + " km");
        System.out.println(meters + " meters is equal to " + feet2 + " feet");
        System.out.println(feet + " feet is equal to " + meters2 + " meters");
        System.out.println(yards + " yards is equal to " + feetFromYards + " feet");
        System.out.println(feet + " feet is equal to " + yardsFromFeet + " yards");
        System.out.println(meters + " meters is equal to " + inchesFromMeters + " inches");
        System.out.println(inches + " inches is equal to " + metersFromInches + " meters");
        System.out.println(inches + " inches is equal to " + cmFromInches + " centimeters");

        input.close();
    }
}
