public class EmployeeBonus {

    // Method to generate random salary and years of service for employees
    public static int[][] generateSalaryAndService(int numEmployees) {
        // Create 2D array to store salary anf year of service
        int[][] data = new int[numEmployees][2];

        // Generating salary and year of service
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // Random 5-digit salary
            data[i][1] = (int)(Math.random() * 11); // Random years of service (0-10)
        }
        
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(int[][] data) {
        int numEmployees = data.length;
        // Create 2D array to store new salary and bonus
        double[][] newSalaryAndBonus = new double[numEmployees][2];
        
        // Calculate new salary and bonus for each employee
        for (int i = 0; i < numEmployees; i++) {
            int salary = data[i][0];
            int yearsOfService = data[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;
            
            // Saving new salary and bonus in the array
            newSalaryAndBonus[i][0] = newSalary;
            newSalaryAndBonus[i][1] = bonus;
        }
        
        return newSalaryAndBonus;
    }

    // Method to calculate and display the total bonus and salaries
    public static void displayBonusAndSalaries(int[][] data, double[][] newSalaryAndBonus) {
        // Create variables to stoe total bonus and salaries
        int numEmployees = data.length;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Display table headers
        System.out.println("Employee   Old Salary  Years of Service  New Salary    Bonus");

        for (int i = 0; i < numEmployees; i++) {
            // Fetching details
            int oldSalary = data[i][0];
            int yearsOfService = data[i][1];
            double newSalary = newSalaryAndBonus[i][0];
            double bonus = newSalaryAndBonus[i][1];
            
            // Display each employee's details
            System.out.println((i + 1) + "          " + oldSalary + "         " + yearsOfService + "                 " + newSalary + "     " + bonus);
            
            // Calculating total old salary, new salary and bonus
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        // Display totals
        System.out.println("\nTotal      " + totalOldSalary + "                     " + totalNewSalary + "     " + totalBonus);
    }

    // Main method
    public static void main(String[] args) {
        int numEmployees = 10;
        
        // Generate random salary and years of service for employees
        int[][] data = generateSalaryAndService(numEmployees);
        
        // Calculate new salary and bonus
        double[][] newSalaryAndBonus = calculateNewSalaryAndBonus(data);
        
        // Display bonus and salaries in tabular format
        displayBonusAndSalaries(data, newSalaryAndBonus);
    }
}
