import java.util.Scanner;

public class CaseConverter {

	// Method to convert the lower case to upper case and vice versa
	public static String textCaseConverter(String text){
		String word = "";
		for(int i=0; i<text.length(); i++){
			if(text.charAt(i) >='A' && text.charAt(i)<='Z') {
				word += (char)(text.charAt(i) + 32);
			} else if(text.charAt(i) >='a' && text.charAt(i)<='z') {
				word += (char)(text.charAt(i) - 32);
			}
		}
		return word;
	}

	// Main method
	public static void main(String[] args) {

	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Take user input for text
	System.out.println("Enter the text: ");
	String text = input.nextLine();

	// Call a method to covert the case
	String updatedText = textCaseConverter(text);

	// Display the result
	System.out.println("The text is " + text + " and the updated text after case convert is " + updatedText);

	// Close the Scanner Object
	input.close();

	}
}