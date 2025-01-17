import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define custom patterns for date formatting
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Format the current date in different formats
        String formattedDate1 = currentDate.format(format1);
        String formattedDate2 = currentDate.format(format2);
        String formattedDate3 = currentDate.format(format3);

        // Display the current date in different formats
        System.out.println("Current Date in dd/MM/yyyy format: " + formattedDate1);
        System.out.println("Current Date in yyyy-MM-dd format: " + formattedDate2);
        System.out.println("Current Date in EEE, MMM dd, yyyy format: " + formattedDate3);
    }
}
