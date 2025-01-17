import java.util.Scanner;

public class MostFrequentCharacter {

	// Method to find MostFrequentCharacter
	public static char findMostFrequentCharacter(String text) {
		char ch = ' ';
		int maxCount = 0;
		int[] charCount = new int[256];
		for (int i = 0; i < text.length(); i++) {
			charCount[text.charAt(i)]++;
		}
		for (int i = 0; i < 256; i++) {
			if (charCount[i] > maxCount) {
				maxCount = charCount[i];
				ch = (char) i;
			}
		}

		return ch;
	}

	// Main method
	public static void main(String[] args) {

		// create a scanner object to take an input from the user
		Scanner input = new Scanner(System.in);

		// Take user input for text
		System.out.println("Enter the text: ");
		String text = input.nextLine();

		// Call a Method to find the MostFrequentCharacter
		char ch = findMostFrequentCharacter(text);

		// Display the result
		System.out.println("The most frequent character is " + ch);

		// Close the Scanner Object
		input.close();

	}
}