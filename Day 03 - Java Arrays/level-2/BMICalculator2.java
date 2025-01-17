import java.util.Scanner;

public class BMICalculator2 {
    public static void main(String[] args) {

        // create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take a user input for the number of persons
        System.out.println("Enter the number of persons: ");
        int number = input.nextInt();

        // Create a multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[number][3];

        // Create an array to store the weight status of the persons
        String[] weightStatus = new String[number];

        // take user input for the person's weight and height
        for (int i = 0; i < number; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.println("Enter the weight (in kg) of person " + (i + 1));
                personData[i][0] = input.nextDouble();
                System.out.println("Enter the height (in meters) of person " + (i + 1));
                personData[i][1] = input.nextDouble();

                if (personData[i][0] > 0 && personData[i][1] > 0) {
                    validInput = true;
                } else {
                    System.out.println("Weight and height must be positive numbers. Please enter again.");
                }
            }
        }

        // calculating BMI and determining weight status
        for (int i = 0; i < number; i++) {
            // calculating BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // checking for weightStatus
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying the results
        System.out.println("Height (m), Weight (kg), BMI, Weight Status:");
        for (int i = 0; i < number; i++) {
            System.out.println(personData[i][1] + ", " + personData[i][0] + ", " + personData[i][2] + ", and " + weightStatus[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}
