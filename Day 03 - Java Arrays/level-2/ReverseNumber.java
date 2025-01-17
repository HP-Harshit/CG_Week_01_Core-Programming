import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {

	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// taking a user input for a number
        System.out.println("Enter the number: ");
        int number = input.nextInt();

	// create a variable maxDigit and initialize with 10 and counter to keep track of array
        int maxDigit = 10, counter = 0;

        // create an array to store the digits of the number
        int[] digitArray = new int[maxDigit];

        // iterating the loop till the number!=0
        while (number != 0 && counter < maxDigit) {
            int remainder = number % 10;
            digitArray[counter] = remainder;
            number /= 10;
            counter++;
        }

	// Displaying the result
	System.out.println("The number in reverse order is: ");
	for(int i = 0; i<counter; i++){
		System.out.print(digitArray[i] + " ");
	}

	// Close the Scanner Object
	input.close();

	}
}