import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        // create a scanner object to take an input from the user
        Scanner input = new Scanner(System.in);

        // Create an array to store salary of employee, year of service, new salary, and bonus
        double[] salary = new double[10];
        double[] yearOfServices = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];

        // create variables to save the total bonus, total old salary, and new salary
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // take user input for the salary and year of service
        for (int i = 0; i < 10; i++) {
            boolean isValid = false; // Fixed syntax error here
            while (!isValid) {
                System.out.println("Enter the salary of employee " + (i + 1) + ": ");
                salary[i] = input.nextDouble();
                System.out.println("Enter the year of services of employee " + (i + 1) + ": ");
                yearOfServices[i] = input.nextDouble();

                // checking for valid input
                if (salary[i] < 0 || yearOfServices[i] < 0) {
                    System.out.println("Invalid input. Salary and years of service must be non-negative.");
                } else {
                    isValid = true;
                }
            }
        }

        // calculating the bonus and new salary of employees
        for (int i = 0; i < 10; i++) {
            if (yearOfServices[i] >= 5) {
                bonus[i] = salary[i] * 0.05; // 5% = 0.05
                newSalary[i] = salary[i] + bonus[i];
            } else {
                bonus[i] = salary[i] * 0.02; // 2% = 0.02
                newSalary[i] = salary[i] + bonus[i];
            }
        }

        // calculating the total bonus, total old salary, and total new salary of employees
        for (int i = 0; i < 10; i++) {
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Displaying the result
        System.out.println("The total bonus payout of employees is " + totalBonus);
        System.out.println("The total old salary is " + totalOldSalary);
        System.out.println("The total new salary is " + totalNewSalary);

        // Close the Scanner Object
        input.close();
    }
}
