import java.util.Scanner;

public class RemoveDuplicates {

	// Method to remove Duplicate Characters
	public static String removeDuplicate(String text){

		String modifiedText = "";
		for(int i=0; i<text.length(); i++) {
			boolean isPresent = false;
			for(int j=0; j<modifiedText.length(); j++) {
				if(text.charAt(i) == modifiedText.charAt(j)) {
					isPresent = true;
					break;
				}
			}
			if (!isPresent) {
				modifiedText += text.charAt(i);
			}
		}
		return modifiedText;
	}

	// Main method
	public static void main(String[] args) {

	// create a main class object to call methods


	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Take user input for string
	System.out.println("Enter the text: ");
	String text = input.nextLine();

	// Calling a method to remove duplicate characters
	String modifiedText = RemoveDuplicates.removeDuplicate(text);

	// Displayinng the result
	System.out.println("The Text is: " + text + "\nAnd the modified text is: " + modifiedText);

	// Close the Scanner Object
	input.close();

	}
}