import java.util.Scanner;

public class TemperatureCalculator {

    // Method to calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        // Calculating the wind chill temperature
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        // Return the result
        return windChill;
    }

    // Main method
    public static void main(String[] args) {
        // Create a main class object
        TemperatureCalculator classObject = new TemperatureCalculator();

        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for temperature and wind speed
        System.out.println("Enter the temperature: ");
        double temperature = input.nextDouble();
        System.out.println("Enter the wind speed: ");
        double windSpeed = input.nextDouble();

        // Create a variable to store the wind chill temperature
        double windChill = classObject.calculateWindChill(temperature, windSpeed);

        // Display the result
        System.out.println("The wind chill temperature is: " + windChill);

        // Close the Scanner object
        input.close();
    }
}
