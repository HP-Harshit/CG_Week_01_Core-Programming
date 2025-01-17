import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {

	// Method to check string anagrams
	public static boolean findAnagrams(String text1, String text2){

		if(text1.length() != text2.length()){
			return false;
		} else {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			for(int i = 0; i<charArray1.length; i++){
				if(charArray1[i] != charArray2[i]){
					return false;
				}
			}
		}
		return true;
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

	// Call a Method to compare two check anagrams
	boolean isAnagrams = findAnagrams(text1, text2);
	
	// Display the result
	System.out.println("Both the strings are " + (isAnagrams ? "Anagrams." : "not anagrams."));

	// Close the Scanner Object
	input.close();

	}
}