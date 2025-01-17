import java.util.Scanner;

public class AgeCheck {
	public static void main(String[] args) {

	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Create an Array to store the age of all 10 students
	int[] age = new int[10];

	// take user input for the students age
	for(int i = 0; i<age.length; i++) {
		System.out.println("Enter the age of student " + (i+1));
		age[i] = input.nextInt();
	}

	// checking the students age
	for(int i = 0; i<age.length; i++) {
		// check for invalid age
		if(age[i] < 0) {
			System.out.println("An invalid age.");
		} else if(age[i] >= 18 ) {
			System.out.println("The student with the age " + age[i] + " can vote.");
		} else {
			System.out.println("The student with the age " + age[i] + " cannot vote.");
			}
		}

	// Close the Scanner Object
	input.close();

	}
}