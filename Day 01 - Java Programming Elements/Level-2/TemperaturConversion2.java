import java.util.Scanner;

public class TemperaturConversion2 {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert the temperature from Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5/9;

        // Print the result
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius.");

        // Close the scanner
        input.close();
    }
}
