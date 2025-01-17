import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and populate the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            // Convert height from cm to meters
            double heightInMeters = data[i][1] / 100;
            // Calculate BMI
            double bmi = data[i][0] / (heightInMeters * heightInMeters);
            // Store BMI in the third column
            data[i][2] = bmi;
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i][2] < 18.5) {
                status[i] = "Underweight";
            } else if (data[i][2] >= 18.5 && data[i][2] <= 24.9) {
                status[i] = "Normal";
            } else if (data[i][2] >= 25.0 && data[i][2] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a 2D array to store weight, height, and BMI for 10 persons
        double[][] data = new double[10][3];

        // Take user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = input.nextDouble();
            System.out.println("Enter the height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = input.nextDouble();
        }

        // Calculate BMI and populate the array
        calculateBMI(data);

        // Determine BMI status
        String[] status = determineBMIStatus(data);

        // Display the height, weight, BMI, and status of each individual
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": ");
            System.out.println("Weight: " + data[i][0] + " kg");
            System.out.println("Height: " + data[i][1] + " cm");
            System.out.println("BMI: " + data[i][2]);
            System.out.println("Status: " + status[i] + "\n");
        }

        // Close the Scanner object
        input.close();
    }
}
