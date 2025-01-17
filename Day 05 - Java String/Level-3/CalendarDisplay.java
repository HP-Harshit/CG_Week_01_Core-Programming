import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        // Create an array of month names
        String[] months = {
                "January", "February", "March", "April", "May", "June", 
                "July", "August", "September", "October", "November", "December"
        };
        // Return the month name based on the input month number
        return months[month - 1];
    }

    // Method to get the number of days in the month
    public static int getNumberOfDaysInMonth(int month, int year) {
        // Create an array of number of days in each month
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        // If the year is a leap year, February has 29 days
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        // Return the number of days in the month
        return days[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4, but not by 100 or divisible by 400.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        // If the year is not a leap year, return false
        return false;
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        // Calculate the day of the week for the first day of the month
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        // Return the day of the week for the first day of the month
        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int numberOfDays = getNumberOfDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("     " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);

            // Move to the next line after Sat
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Create a scanner class object
        Scanner input = new Scanner(System.in);

        // Take user input for month and year
        System.out.println("Enter the month (1-12): ");
        int month = input.nextInt();
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

        // Close the Scanner object
        input.close();
    }
}
