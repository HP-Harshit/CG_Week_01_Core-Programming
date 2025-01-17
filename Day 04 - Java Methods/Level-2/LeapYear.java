import java.util.Scanner;

public class LeapYear {

    // Method to check for Leap Year
    public static boolean checkLeapYear(int year) {
        // Checking for the correct year according to the Gregorian calendar
        if (year >= 1582) {
            // Leap year is divisible by 4 and not divisible by 100 or divisible by 400
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for a year
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        // Create a variable to store the result
        boolean isLeapYear = LeapYear.checkLeapYear(year);

        // Displaying the result
        if (isLeapYear) {
            System.out.println("The year " + year + " is a leap year");
        } else {
            System.out.println("The year " + year + " is not a leap year");
        }

        // Close the Scanner object
        input.close();
    }
}
