import java.util.Scanner;

public class FrequencyOfDigit {
	public static void main(String[] args) {

	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Take input for the number
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // create a variable maxDigit and initialize with 10 and index to keep track of array
        int maxDigit = 10, index = 0;

        // create an array to store the digits of the number
        int[] digitArray = new int[maxDigit];

        // iterating the loop till the number!=0
        while (number != 0 && index < maxDigit) {
            int remainder = number % 10;
            digitArray[index] = remainder;
            number /= 10;
            index++;
        }

	// create a frequency array of size 10
	int[] frequency = new int[10];

	// loop through the digits array, and increase the frequency of each digit
	for(int i = 0; i<index; i++){
		frequency[digitArray[i]]++;
	}

	// Display the result
	System.out.println("Frequency of each digit: ");
	for(int i=0; i<10; i++){
		if(frequency[i] > 0) {
			System.out.println("Digit " + i + ": " + frequency[i]);
		}
	}

	// Close the Scanner Object
	input.close();

	}
}