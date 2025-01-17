public class NullPointerExceptionDemo {

	// Method to generate NullPointerException
	public static void generateNullPointerException() {
		String text = null; // Initialize the variable to null
		int length = text.length(); // This line will generate NullPointerException
	}

	// Method to handle NullPointerException
	public static void handleNullPointerException() {
		String text = null; // Initialize the variable to null
		try {
			int length = text.length(); // This line will generate NullPointerException
		} catch (NullPointerException e) {
			// Handle the NullPointerException
			System.out.println("Caught a NullPointerException: " + e.getMessage());
		} catch (Exception e) {
			// Handle any other exceptions
			System.out.println("Caught an Exception: " + e.getMessage());
		}
	}

	// Main method
	public static void main(String[] args) {

		// Call the method to generate NullPointerException
		System.out.println("Generating NullPointerException:");
		try {
			generateNullPointerException();
		} catch (Exception e) {
			System.out.println("Exception caught in main: " + e.getMessage());
		}

		// Call the method to handle NullPointerException
		System.out.println("\nHandling NullPointerException:");
		handleNullPointerException();
	}
}
