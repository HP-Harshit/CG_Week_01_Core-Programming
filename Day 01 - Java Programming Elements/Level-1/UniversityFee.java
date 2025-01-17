import java.util.Scanner;

public class UniversityFee {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the student fee
        System.out.print("Enter the student fee (INR): ");
        double fee = input.nextDouble();

        // Take user input for the discount percentage
        System.out.print("Enter the discount percentage (%): ");
        double discountPercent = input.nextDouble();

        // Calculate the discount amount
        double discount = fee * (discountPercent / 100.0);

        // Calculate the final fee to pay after discount
        double feeToPay = fee - discount;

        // Print the results
        System.out.println("The discount amount is INR " + discount + 
                           " and the final discounted fee is INR " + feeToPay);
        
        // Close the scanner
        input.close();
    }
}