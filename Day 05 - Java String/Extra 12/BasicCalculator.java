import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        // Create a scanner class object
        Scanner input = new Scanner(System.in);

        // Performing operations
        while (true) {
            System.out.println("\nBasic Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            int num1;
            int num2;
            switch (choice) {
                // Addition
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = input.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = input.nextInt();
                    System.out.println("Result: " + (add(num1, num2)));
                    break;   

                // Subtraction
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = input.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = input.nextInt();
                    System.out.println("Result: " + (substract(num1, num2)));
                    break;

                // Multiplication
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = input.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = input.nextInt();
                    System.out.println("Result: " + (multiplication(num1, num2)));
                    break;

                // Division
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = input.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = input.nextInt();
                    System.out.println("Result: " + (division(num1, num2)));
                    break;

                // Exit
                case 5:
                    System.out.println("Exiting");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }
        // Close Scanner object
        // input.close();
    }
    

    // Method to perform Addition operation
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to perform subtraction operation
    public static int substract(int num1, int num2) {
        return num1 - num2;
    }
    // Method to perform multiplication operation
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    // Method to perform division operation
    public static int division(int num1, int num2) {
        return num1 / num2;
    }
}
