import java.util.Scanner;

public class NumberAnalysis {

    // Method that generates an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        // Create an array to store the random numbers
        int[] numbers = new int[size];

        // Generate random 4-digit numbers
        for (int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000; // Generates random number between 1000 and 9999
        }

        return numbers;
    }

    // Method to find average, min, and max values
    public double[] findAverageMinMax(int[] numbers) {
        // Create an array to store the results: result[0]:average, result[1]:min, result[2]:max
        double[] result = new double[3];

        // Calculate average
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        result[0] = sum / numbers.length;

        // Calculate minimum number
        double min = numbers[0];
        for (int number : numbers) {
            min = Math.min(min, number);
        }
        result[1] = min;

        // Calculate maximum number
        double max = numbers[0];
        for (int number : numbers) {
            max = Math.max(max, number);
        }
        result[2] = max;

        return result;
    }

    // Main method
    public static void main(String[] args) {
        // Create a main class object to call methods
        NumberAnalysis classObject = new NumberAnalysis();

        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Indicate the size of the array
        int size = 5;

        // Call the method to generate random numbers
        int[] numbers = classObject.generate4DigitRandomArray(size);

        // Call the method to find average, min, and max values
        double[] avgMinMax = classObject.findAverageMinMax(numbers);

        // Display the results
        System.out.println("Generated 4-digit random numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("Average: " + avgMinMax[0]);
        System.out.println("Minimum: " + avgMinMax[1]);
        System.out.println("Maximum: " + avgMinMax[2]);

        // Close the Scanner object
        input.close();
    }
}
