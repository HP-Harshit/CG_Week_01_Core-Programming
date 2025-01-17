import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // create a scanner object to take an input from the user
        Scanner input = new Scanner(System.in);

        // take a user input for a positive number
        System.out.println("Enter a positive number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            // create a string array
            String[] array = new String[number];

            // iterating till the number to store the elements in an array
            for (int i = 1; i <= number; i++) {
                // checking for the multiple of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    array[i - 1] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    array[i - 1] = "Fizz";
                } else if (i % 5 == 0) {
                    array[i - 1] = "Buzz";
                } else {
                    array[i - 1] = Integer.toString(i);
                }
            }

            // displaying the result
            for (int i = 0; i < number; i++) {
                System.out.println("Position " + (i + 1) + " = " + array[i]);
            }
        }

        // Close the Scanner Object
        input.close();
    }
}
