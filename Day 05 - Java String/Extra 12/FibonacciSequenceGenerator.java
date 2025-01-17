import java.util.Scanner;
import java.util.Arrays;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {

        // Create a scanner class object
        Scanner input = new Scanner(System.in);

        // Ask user input for a number;
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        // Call a method to generate fibonacci series
        int[] fibSeries = generateFibonacciSeries(n);

        // Call a mmethd to display result
        displayFibonacciSeries(fibSeries);

        // Close the scanner object
        input.close();
    }

    // Method to generate fibonacci series
    public static int[] generateFibonacciSeries(int n) {
        int[] fibSeries = new int[n];
        int index=2;
        fibSeries[0] = 0;
        fibSeries[1] = 1;
        for (int i = 2; i < n; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
            if(fibSeries[i]>=n){
                break;
            } else {
                index++;
            }
        }
        int[] result = new int[index];
        System.arraycopy(fibSeries, 0, result, 0, index);
        return result;
    }

    // Method to display fibonacci series
    public static void displayFibonacciSeries(int[] fibSeries) {
        System.out.println("Fibonacci Series: " + Arrays.toString(fibSeries));
    };
}
