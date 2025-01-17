import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[][] calculateBMIAndStatus(double[][] heightWeightArray) {
        // Initialize an 2D empty array to store the results
        String[][] bmiStatusArray = new String[heightWeightArray.length][4];
        // Loop through each row in the array
        for (int i = 0; i < heightWeightArray.length; i++) {
            // Extract height and weight from the array
            double weight = heightWeightArray[i][0];
            double heightInCm = heightWeightArray[i][1];
            double heightInM = heightInCm / 100; // Convert height to meters
            double bmi = weight / (heightInM * heightInM); // Calculate BMI
            String status;

            // Determine the BMI status
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 40) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store height, weight, BMI, and status in the 2D array
            bmiStatusArray[i][0] = String.valueOf(heightInCm);
            bmiStatusArray[i][1] = String.valueOf(weight);
            bmiStatusArray[i][2] = String.valueOf(bmi); // Keep BMI as a simple double value
            bmiStatusArray[i][3] = status;
        }
        // Return the 2D array containing the results
        return bmiStatusArray;
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] bmiStatusArray) {
        System.out.println("Person\tHeight (cm)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < bmiStatusArray.length; i++) {
            System.out.println((i + 1) + "\t" + bmiStatusArray[i][0] + "\t\t" + bmiStatusArray[i][1] + "\t\t" + bmiStatusArray[i][2] + "\t" + bmiStatusArray[i][3]);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create a scanner class object
        Scanner input = new Scanner(System.in);
        // Create a 2D array to store height and weight data
        double[][] heightWeightArray = new double[10][2];

        // Take user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ": ");
            heightWeightArray[i][0] = input.nextDouble();
            System.out.println("Enter height (in cm) for person " + (i + 1) + ": ");
            heightWeightArray[i][1] = input.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiStatusArray = calculateBMIAndStatus(heightWeightArray);

        // Display the results in a tabular format
        displayResults(bmiStatusArray);

        // Close the Scanner object
        input.close();
    }
}
