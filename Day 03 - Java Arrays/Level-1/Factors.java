import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {

	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// take a user input for a number
	System.out.println("Enter the number: ");
	int number = input.nextInt();

	// create integer variable maxFactor and initialize to 10
	int maxFactor = 10, index = 0;

	// Create an Array of size 5 to store the numbers
	int[] factorArray = new int[maxFactor];

	// iterating the loop from 1 to the number
	for(int i = 1; i<=number; i++) {

		// checking for the factor
		if (number % i == 0 ) {

			// checking index
			if (index == maxFactor) {
				// Double the size of the array
				maxFactor *= 2;
                   		int[] tempArray = new int[maxFactor];
                    		for (int j = 0; j < index; j++) {
                        		tempArray[j] = factorArray[j];
                    			}
                    		factorArray = tempArray;
                		}

			factorArray[index] = i;
			index++;
		}
	}

	// Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factorArray[i] + " ");
        }

	// Close the Scanner Object
	input.close();

	}
}