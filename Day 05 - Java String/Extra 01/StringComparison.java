import java.util.Scanner;

public class StringComparison {

	// Method to find lexicographical order
	public static String[] lexicographicalStrings(String text1, String text2){
		String[] lexiOrder = new String[2];
		int length = text1.length()<=text2.length() ? text1.length() : text2.length();
		for(int i = 0; i<length; i++){
			if(text1.charAt(i)<text2.charAt(i)){
				lexiOrder[0] = text1;
				lexiOrder[1] = text2;
				return lexiOrder;
			} else if(text1.charAt(i)<text2.charAt(i)){
				lexiOrder[0] = text2;
				lexiOrder[1] = text1;
				return lexiOrder;
			}
		}
		return lexicographicalStrings(text1.substring(1, length), text2.substring(1, length));
	}


	// Main method
	public static void main(String[] args) {

	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Take user input for text
	System.out.println("Enter the text1: ");
	String text1 = input.nextLine();
	System.out.println("Enter the text2: ");
	String text2 = input.nextLine();

	// Call a Method to compare two string lexicographically
	String[] lexiOrder = lexicographicalStrings(text1, text2);

	// Display the result
	System.out.println("\"" + lexiOrder[0] + "\" comes before \"" + lexiOrder[1] + "\" in lexicographical order");

	// Close the Scanner Object
	input.close();

	}
}