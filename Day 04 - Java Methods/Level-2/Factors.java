import java.util.Scanner;

public class Factors {

    // Static method to find the factors and store them in an array
    public static int[] findFactors(int number) {
        // Variable to count the number of factors
        int count = 0;

        // Finding the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Creating an array to save the factors
        int[] factorArray = new int[count];
        
        // Variable to keep track of the array index
        int index = 0;

        // Finding the factors and saving them into an array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorArray[index] = i;
                index++;
            }
        }
        return factorArray;
    }

    // Method to find the sum of the factors using the factors array
    public static int sumFactor(int[] factorArray) {
        int sum = 0;
        for (int i = 0; i < factorArray.length; i++) {
            sum += factorArray[i];
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productFactor(int[] factorArray) {
        int product = 1;
        for (int i = 0; i < factorArray.length; i++) {
            product *= factorArray[i];
        }
        return product;
    }
    
    // Method to find the sum of the square of the factors using the factors array
    public static int sumSquareFactor(int[] factorArray) {
        int sumSquare = 0;
        for (int i = 0; i < factorArray.length; i++) {
            sumSquare += Math.pow(factorArray[i], 2);
        }
        return sumSquare;
    }

    // Main method
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for a number
        System.out.println("Enter the number: ");
        int number = input.nextInt();

        // Create variables to store factors, sum, product, and sum of square of factors
        int[] factorArray = Factors.findFactors(number);
        int sum = Factors.sumFactor(factorArray);
        int product = Factors.productFactor(factorArray);
        int sumSquare = Factors.sumSquareFactor(factorArray);

        // Display the result
        System.out.println("The factors of the number " + number + " are: ");
        for (int i = 0; i < factorArray.length; i++) {
            System.out.print(factorArray[i] + " ");
        }
        System.out.println("\nThe sum of the factors is: " + sum);
        System.out.println("The sum of square of the factors is: " + sumSquare);
        System.out.println("The product of the factors is: " + product);

        // Close the Scanner object
        input.close();
    }
}
