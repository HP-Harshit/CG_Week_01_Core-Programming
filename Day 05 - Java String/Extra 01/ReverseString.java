import java.util.Scanner;

public class ReverseString {

	// Method to reverse the string
	public static String reverseString(String text){
		// Create a reverse variable to copy the string
		String reverse = "";
		// Looping to reverse the string
		for(int i = text.length()-1; i>=0; i--){
			reverse += text.charAt(i);
		}
		// Returning the result
		return reverse;
	}

	// Main method
	public static void main(String[] args) {

	// create a main class object to call methods


	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Take user input for string to reverse it
	System.out.println("Enter the text: ");
	String text = input.nextLine().trim().toLowerCase(); 

	// Calling reverse string method
	String reverse = ReverseString.reverseString(text);

	// Displaying the result
	System.out.println("The string is: " + text + "\nThe reverse string is: " + reverse);

	// Close the Scanner Object
	input.close();

	}
}