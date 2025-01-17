import java.util.Scanner;

public class MaxOfThreeNumbers {
    //Main Method
    public static void main(String[] args){
        
        // Create a scanner class object
        Scanner input = new Scanner(System.in);

        // Ask user for input three numbers
        System.out.println("Enter the first number: ");
        int num1 = getInput();
        System.out.println("Enter the second number: ");
        int num2 = getInput();
        System.out.println("Enter the third number: ");
        int num3 = getInput();

        // Call a method to get a maximum number
        int max = getMax(num1, num2, num3);

        // Call a method to display result
        displayResult(max);

        // Close the scanner object
        input.close();
    }
    
    // Method to take number as input from the user
    public static int getInput() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        return num;
    }

    // method to find max number
    public static int getMax(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    // Method to display result
    public static void displayResult(int max) {
        System.out.println("The maximum number is: " + max);
    }
}
