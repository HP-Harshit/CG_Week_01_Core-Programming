import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Convert height to inches
        double heightInches = heightCm / 2.54;

        // Convert height to feet and remaining inches
        int heightFeet = (int) (heightInches / 12);
        double remainingInches = heightInches % 12;

        // Print the results
        System.out.println("Your height in cm is " + heightCm + 
                           " while in feet is " + heightFeet + 
                           " and inches is " + remainingInches);
        
        // Close the scanner
        input.close();
    }
}
