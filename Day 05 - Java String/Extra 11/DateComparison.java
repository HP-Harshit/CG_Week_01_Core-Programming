import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for the first date input
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateString = input.nextLine();

        // Prompt user for the second date input
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateString = input.nextLine();

        // Parse the input dates
        LocalDate firstDate = LocalDate.parse(firstDateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate secondDate = LocalDate.parse(secondDateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Compare the dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date is the same as the second date.");
        }

        input.close();
    }
}
