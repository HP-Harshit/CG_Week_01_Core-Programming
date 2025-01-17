import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the unit price
        System.out.print("Enter the unit price: ");
        double unitPrice = input.nextDouble();

        // Take user input for the number of quantity
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

	// Calculate the total price
	double totalPrice = unitPrice * quantity;

	// Print the Result
	System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

	// Close the scanner
	input.close();

	}
}