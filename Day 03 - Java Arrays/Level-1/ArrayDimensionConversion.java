import java.util.Scanner;

public class ArrayDimensionConversion {
    public static void main(String[] args) {

        // create a scanner object to take an input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for rows and columns
        System.out.println("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = input.nextInt();

        // Create a 2D-Array 
        int[][] matrix = new int[rows][columns];

        // take user input for the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the number at [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // create a 1D-Array to copy the elements of 2D-Array
        int[] array = new int[rows * columns];

        // create an index variable to keep track of 1D-Array
        int index = 0;

        // copying 2D-Array to 1D-Array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Displaying the 1D-Array
        System.out.println("The 1D array is: ");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the Scanner Object
        input.close();
    }
}
