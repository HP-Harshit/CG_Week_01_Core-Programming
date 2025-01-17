import java.util.Scanner;

public class RemoveChar {

	// Method to remove the specific cahr from the string
	public static String removeCharFromString(String text, char ch){
		String newText = "";
		for(int i = 0; i<text.length(); i++){
			if(text.charAt(i) == ch){
				continue;
			} else {
				newText += text.charAt(i);
			}
		}
		return newText;
	}

	// Main method
	public static void main(String[] args) {

	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Take user input for text and char to remove
	System.out.println("Enter the text: ");
	String text = input.nextLine();
	System.out.println("Enter the char to remove: ");
	char ch = input.next().charAt(0);

	// Call a Method to remove the char from the string
	String newText = removeCharFromString(text, ch);

	// Display the result
	System.out.println("The text is " + text + "\nAnd the new text is " + newText);

	// Close the Scanner Object
	input.close();

	}
}