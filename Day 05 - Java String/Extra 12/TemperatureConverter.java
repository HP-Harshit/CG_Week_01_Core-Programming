import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){

        // Create a scanner class object
        Scanner input = new Scanner(System.in);

        // Performing operations
        while(true){
            System.out.println("\nTemperature Converter");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            double celsius;
            double fahrenheit;
            switch (choice) {
                case 1:
                System.out.print("Enter temperature in Celsius: ");
                celsius = input.nextDouble();
                fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + "C is equal to " + fahrenheit + "F");
                break;
            
                case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = input.nextDouble();
                celsius = fahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + "F is equal to " + celsius + "C");
                break;

                case 3:
                System.out.println("Exiting the program");
                System.exit(0);
                break;
                
                default:
                System.out.println("Invalid Choice!");
                break;
            }
        }
        // Close Scanner object
        // input.close();

    }

    // Method too cnvert celsius to fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method too cnvert fahrenheit to celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
