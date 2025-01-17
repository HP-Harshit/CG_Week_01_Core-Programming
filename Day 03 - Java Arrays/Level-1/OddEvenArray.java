import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {

        // create a scanner object to take an input from the user
        Scanner input = new Scanner(System.in);

        // take a user input for a number
        System.out.println("Enter the number: ");
        int number = input.nextInt();

        if (number > 0) {

            // Create an Array of size [ (number/2)+1 ] to store the odd numbers
            int[] oddArray = new int[(number / 2) + 1];

            // Create an Array of size [ (number/2)+1 ] to store the even numbers
            int[] evenArray = new int[(number / 2) + 1];

            // create an index for odd and even array
            int oddIndex = 0, evenIndex = 0;

            // storing the odd and even values to respective array using for loop
            for (int i = 1; i <= number; i++) {

                // Checking for odd/even number
                if (i % 2 == 0) {
                    evenArray[evenIndex] = i;
                    evenIndex++;
                } else {
                    oddArray[oddIndex] = i;
                    oddIndex++;
                }
            }

            // printing oddArray using oddIndex
            System.out.println("Odd Array: ");
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(oddArray[i] + " ");
            }

            // printing evenArray using evenIndex
            System.out.println("\nEven Array: ");
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(evenArray[i] + " ");
            }

        } else {
            System.out.println("Error! The number must be a natural number.");
            // Exiting the program
            System.exit(0);
        }

        // Close the Scanner Object
        input.close();
    }
}
