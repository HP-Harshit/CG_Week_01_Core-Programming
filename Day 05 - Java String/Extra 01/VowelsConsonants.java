import java.util.Scanner;

public class VowelsConsonants {

	// Main method
	public static void main(String[] args) {

	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Take user input for string
	System.out.println("Enter the text: ");
	String text = input.nextLine().trim().toLowerCase(); 

	// Create a variable to indicate the count of vowels and cosonants
	int vowels = 0, consonants = 0;

	// Looping to count the vowels and cosonants
	for(int i = 0; i<text.length(); i++){
		if(text.charAt(i) == ' '){
			continue;
		} else if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
			vowels++; 
		} else {
			consonants++;
		}
	}

	// Displaying the detail
	System.out.println("The number of Vowels and Consonants in a text " + text + " are " + vowels + " and " + consonants);

	// Close the Scanner Object
	input.close();

	}
}