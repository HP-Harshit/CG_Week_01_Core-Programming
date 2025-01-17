import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for date input
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String dateString = input.nextLine();

        // Parse the input date
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Add 7 days, 1 month, and 2 years to the date
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks from the result
        newDate = newDate.minusWeeks(3);

        // Display the final date
        System.out.println("Original Date: " + date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println("Final Date after operations: " + newDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        input.close();
    }
}
