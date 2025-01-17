import java.util.Scanner;

public class TemperaturConversion {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert the temperature from Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9/5) + 32;

        // Print the result
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit.");

        // Close the scanner
        input.close();
    }
}
