import java.util.Scanner;

public class TableFrom6To9 {
    public static void main(String[] args) {

        // create a scanner object to take an input from the user
        Scanner input = new Scanner(System.in);

        // Take a user input for the number
        System.out.println("Enter the number: ");
        int number = input.nextInt();

        // Create an array to store result of multiplication table
        int[] multiplicationTable = new int[4];

        // iterate a loop from 6 to 9 to store multiplication table result
        for (int i = 0; i < 4; i++) {
            // Calculating the result
            multiplicationTable[i] = number * (6 + i);
        }

        // iterate a loop from 6 to 9 to print multiplication table
        for (int i = 0; i < 4; i++) {
            // displaying the result
            System.out.println(number + " * " + (6 + i) + " = " + multiplicationTable[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}
