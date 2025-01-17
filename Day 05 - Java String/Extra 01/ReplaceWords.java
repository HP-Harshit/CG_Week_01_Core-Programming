import java.util.Scanner;

public class ReplaceWords {

    // Method to split the text into words using charAt()
    public static String[] repaceWordsInString(String text, String word1, String newWord) {
        String[] words = new String[text.length()];
        String word = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                if (!word.equals("")) {
                    words[index++] = word;
                    word = "";
                }
            } else {
                word += text.charAt(i);
            }
        }
        // Add the last word
        if (!word.equals("")) {
            words[index++] = word;
        }

        // Trim the array to remove null values
        String[] result = new String[index];
        for (int i = 0; i < index; i++) {
		if(words[i].equals(word1)){
			result[i] = newWord;
		} else {
            		result[i] = words[i];
		}
        }
        return result;
    }

	// Main method
	public static void main(String[] args) {

	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Take user input for text
	System.out.println("Enter the text: ");
	String text = input.nextLine();
	System.out.println("Enter the word to be replace: ");
	String word = input.nextLine();
	System.out.println("Enter the new word: ");
	String newWord = input.nextLine();

	// Call a Method to replace the words
	String[] newText = repaceWordsInString(text, word, newWord);
	
	// Display the result
		System.out.println("The new text is\n");
	for(String str : newText){
		System.out.print(str + " ");
	}

	// Close the Scanner Object
	input.close();

	}
}