import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {

	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Take a user input for a number of persons;
	System.out.println("Enter the number of persons: ");
	int person = input.nextInt();

	// Create an Array to store weight, height, BMI and weightStatus pf the person
	double[] weight = new double[person];
	double[] height = new double[person];
	double[] bmi = new double[person];
	String[] weightStatus = new String[person];

	// take user input for the person weight and height
	for(int i = 0; i<person; i++) {
                System.out.println("Enter the weight (in kg) of person " + (i + 1));
		weight[i] = input.nextDouble();
                System.out.println("Enter the height (in meters) of person " + (i + 1));
		height[i] = input.nextDouble();
	}

	for(int i = 0; i<person; i++) {
		// calculating bmi
		bmi[i] = weight[i] / (height[i] * height[i]);

		//checking for weightStatus
		if (bmi[i] <= 18.4) {
           		 weightStatus[i] = "Underweight";
       		 } else if (bmi[i] <= 24.9) {
          		  weightStatus[i] = "Normal";
        	} else if (bmi[i] <= 39.9) {
          		  weightStatus[i] = "Overweight";
       		 } else {
           		 weightStatus[i] = "Obese";
       		 }
	}

	// Displying the result
	System.out.println("Height (m), Weight (kg), BMI, Weight Status:");
	for(int i = 0; i<person; i++){
		System.out.println(height[i] + ", " + weight[i] + ", " + bmi[i] + ", " + weightStatus[i]);
	}

	// Close the Scanner Object
	input.close();

	}
}