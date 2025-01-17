import java.util.Scanner;

public class SpringSeason {

    // Method to check the spring season
    boolean seasonCheck(int day, int month) {
        // Checking for spring season and returning the result
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20)) {
            return true;
        } else if (month > 3 && month < 6) {
            return true;
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        // Create a main class object to call methods
        SpringSeason classObject = new SpringSeason();

        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Taking user input for month and day
        System.out.println("Enter the day (1-31): ");
        int day = input.nextInt();
        System.out.println("Enter the month (1-12): ");
        int month = input.nextInt();

        // Create a variable to store the result
        boolean result = classObject.seasonCheck(day, month);

        // Displaying the result
        if (result) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        // Close the Scanner object
        input.close();
    }
}
