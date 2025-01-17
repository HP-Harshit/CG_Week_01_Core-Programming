import java.util.Scanner;

public class LongestWord {

	// Method to find longest word
	public static String findLongestWord(String text) {
		String[] words = text.split(" ");
		String longest = words[1];
		for(int i = 0; i<words.length; i++){
			if(longest.length() < words[i].length()) {
				longest = words[i];
			}
		}
		return longest;
	}
		


	// Main method
	public static void main(String[] args) {

	// create a main class object to call methods


	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Take user input for string
	System.out.println("Enter the text: ");
	String text = input.nextLine();

	// Calling a method to find longest word
	String word = LongestWord.findLongestWord(text);

	// Display the Result
	System.out.println(word);

	// Close the Scanner Object
	input.close();

	}
}