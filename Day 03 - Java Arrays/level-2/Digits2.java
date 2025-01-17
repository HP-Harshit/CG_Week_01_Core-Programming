import java.util.Scanner;

public class Digits2 {
    public static void main(String[] args) {

        // create a scanner object to take an input from the user
        Scanner input = new Scanner(System.in);

        // taking a user input for a number
        System.out.println("Enter the number: ");
        long number = input.nextLong();

        // create a variable maxDigit and initialize with 10 and index to keep track of array
        int maxDigit = 10, index = 0;

        // create an array to store the digits of the number
        int[] digitArray = new int[maxDigit];

        // iterating the loop till the number!=0
        while (number != 0) {
            if (index == maxDigit) {
                // Increase the size of the array by 10
                maxDigit += 10;
                int[] tempArray = new int[maxDigit];
                for (int i = 0; i < index; i++) {
                    tempArray[i] = digitArray[i];
                }
                digitArray = tempArray;
            }

            int remainder = (int)(number % 10);
            digitArray[index] = remainder;
            number /= 10;
            index++;
        }

        // create two variables to store largest and second largest number
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        // iterating array to find the largest and second largest number
        for (int i = 0; i < index; i++) {
            if (largest < digitArray[i]) {
                secondLargest = largest;
                largest = digitArray[i];
            } else if (secondLargest < digitArray[i] && digitArray[i] < largest) {
                secondLargest = digitArray[i];
            }
        }

        // Displaying the result
        System.out.println("The largest digit is: " + largest);
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest digit as all digits are the same.");
        } else {
            System.out.println("The second largest digit is: " + secondLargest);
        }

        // Close the Scanner Object
        input.close();
    }
}
