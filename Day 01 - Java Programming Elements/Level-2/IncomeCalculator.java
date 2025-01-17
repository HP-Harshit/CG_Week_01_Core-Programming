import java.util.Scanner;

public class IncomeCalculator {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the salary
        System.out.print("Enter the salary (INR): ");
        double salary = input.nextDouble();

        // Take user input for the bonus
        System.out.print("Enter the bonus (INR): ");
        double bonus = input.nextDouble();

        // Calculate the total income by adding salary and bonus
        double totalIncome = salary + bonus;

        // Print the results
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
                           ". Hence Total Income is INR " + totalIncome);

        // Close the scanner
        input.close();
    }
}
