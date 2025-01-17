import java.util.Scanner;

public class SubstringOccurrences {

	// Method to find the substring occurrences
	public static int findSubstringOccurrences(String text, String substring){
		int size = substring.length();
		int count = 0;
		for(int i=0; i<text.length()-substring.length()+1; i++){
			if(substring.equals(text.substring(i, size+i))){
				count++;
			}
		}
		return count;
	}

	// Main method
	public static void main(String[] args) {

	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Take user input for text
	System.out.println("Enter the text: ");
	String text = input.nextLine();
	System.out.println("Enter the substring: ");
	String substring = input.nextLine();

	// Method to find the occurrences of the substring
	int occurrence = findSubstringOccurrences(text, substring);

	// Display the result
	System.out.println("The occurrence of substring " + substring + " in a text " + text + " is " + occurrence);

	// Close the Scanner Object
	input.close();

	}
}