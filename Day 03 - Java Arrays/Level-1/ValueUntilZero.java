import java.util.Scanner;

public class ValueUntilZero {
	public static void main(String[] args) {

	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Create an Array of size 10 to store the values
	double[] value = new double[10];

	// Create a variable to indicate the total sum of values
	double totalSum = 0;

	// create a variable to keep on track of the array length
	int counter = 0;

	// take user input for the values until user enter zero or negative number using while(true)
	while(true){
		// take a user input for the number
		System.out.println("Enter the number: ");
		double number = input.nextDouble();

		if ( number <= 0 || counter == 10){
			break;
		} else {
			value[counter] = number;
			counter++;
		}			
	}
	
	// calculating the total sum of the array values using for loop
	for(int i=0; i<counter; i++) {
		totalSum += value[i];
	}

	// displaying the result
	System.out.println("The values are: ");
	for(int i=0; i<counter; i++) {
		System.out.print(value[i] + "  ");
	}
	System.out.println("\nThe total sum of the value is: " + totalSum);

	// Close the Scanner Object
	input.close();

	}
}