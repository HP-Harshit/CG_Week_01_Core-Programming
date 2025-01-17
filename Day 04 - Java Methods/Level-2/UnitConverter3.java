import java.util.Scanner;

public class UnitConverter3 {

    // Method to convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        // Conversion factor from kilometers to miles
        double km2miles = 0.621371;
        // Convert kilometers to miles
        return km * km2miles;
    }

    // Method to convert miles to kilometers and return the value
    public static double convertMilesToKm(double miles) {
        // Conversion factor from miles to kilometers
        double miles2km = 1.60934;
        // Convert miles to kilometers
        return miles * miles2km;
    }

    // Method to convert meters to feet and return the value
    public static double convertMetersToFeet(double meters) {
        // Conversion factor from meters to feet
        double meters2feet = 3.28084;
        // Convert meters to feet
        return meters * meters2feet;
    }

    // Method to convert feet to meters and return the value
    public static double convertFeetToMeters(double feet) {
        // Conversion factor from feet to meters
        double feet2meters = 0.3048;
        // Convert feet to meters
        return feet * feet2meters;
    }

    // Method to convert yards to feet and return the value
    public static double convertYardsToFeet(double yards) {
        // Conversion factor from yards to feet
        double yards2feet = 3.0;
        // Convert yards to feet
        return yards * yards2feet;
    }

    // Method to convert feet to yards and return the value
    public static double convertFeetToYards(double feet) {
        // Conversion factor from feet to yards
        double feet2yards = 0.333333;
        // Convert feet to yards
        return feet * feet2yards;
    }

    // Method to convert meters to inches and return the value
    public static double convertMetersToInches(double meters) {
        // Conversion factor from meters to inches
        double meters2inches = 39.3701;
        // Convert meters to inches
        return meters * meters2inches;
    }

    // Method to convert inches to meters and return the value
    public static double convertInchesToMeters(double inches) {
        // Conversion factor from inches to meters
        double inches2meters = 0.0254;
        // Convert inches to meters
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters and return the value
    public static double convertInchesToCm(double inches) {
        // Conversion factor from inches to centimeters
        double inches2cm = 2.54;
        // Convert inches to centimeters
        return inches * inches2cm;
    }

    // Method to convert Fahrenheit to Celsius and return the value
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        // Conversion formula from Fahrenheit to Celsius
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit and return the value
    public static double convertCelsiusToFahrenheit(double celsius) {
        // Conversion formula from Celsius to Fahrenheit
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms and return the value
    public static double convertPoundsToKilograms(double pounds) {
        // Conversion factor from pounds to kilograms
        double pounds2kilograms = 0.453592;
        // Convert pounds to kilograms
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds and return the value
    public static double convertKilogramsToPounds(double kilograms) {
        // Conversion factor from kilograms to pounds
        double kilograms2pounds = 2.20462;
        // Convert kilograms to pounds
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters and return the value
    public static double convertGallonsToLiters(double gallons) {
        // Conversion factor from gallons to liters
        double gallons2liters = 3.78541;
        // Convert gallons to liters
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons and return the value
    public static double convertLitersToGallons(double liters) {
        // Conversion factor from liters to gallons
        double liters2gallons = 0.264172;
        // Convert liters to gallons
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take input for kilometers
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

        // Take input for Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Take input for Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Take input for pounds
        System.out.print("Enter the weight in pounds: ");
        double pounds = input.nextDouble();

        // Take input for kilograms
        System.out.print("Enter the weight in kilograms: ");
        double kilograms = input.nextDouble();

        // Take input for gallons
        System.out.print("Enter the volume in gallons: ");
        double gallons = input.nextDouble();

        // Take input for liters
        System.out.print("Enter the volume in liters: ");
        double liters = input.nextDouble();

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
        double celsius2 = convertFahrenheitToCelsius(fahrenheit);
        double fahrenheit2 = convertCelsiusToFahrenheit(celsius);
        double kilograms2 = convertPoundsToKilograms(pounds);
        double pounds2 = convertKilogramsToPounds(kilograms);
        double liters2 = convertGallonsToLiters(gallons);
        double gallons2 = convertLitersToGallons(liters);

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
        System.out.println(fahrenheit + " °F is equal to " + celsius2 + " °C");
        System.out.println(celsius + " °C is equal to " + fahrenheit2 + " °F");
        System.out.println(pounds + " pounds is equal to " + kilograms2 + " kilograms");
        System.out.println(kilograms + " kilograms is equal to " + pounds2 + " pounds");
        System.out.println(gallons + " gallons is equal to " + liters2 + " liters");
        System.out.println(liters + " liters is equal to " + gallons2 + " gallons");

        input.close();
    }
}
