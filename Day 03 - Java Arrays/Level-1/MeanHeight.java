import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {

        // create a scanner object to take an input from the user
        Scanner input = new Scanner(System.in);

        // Create an Array to store the heights of 11 players
        double[] player = new double[11];

        // create a variable to indicate the total of the player heights
        double totalHeight = 0.0;

        // take user input for the height of the players
        for (int i = 0; i < player.length; i++) {
            System.out.println("Enter the height of player " + (i + 1) + ": ");
            player[i] = input.nextDouble();
        }

        // iterating the array player to calculate the total height of the players
        for (int i = 0; i < player.length; i++) {
            totalHeight += player[i];
        }

        // create a variable to indicate the mean height
        double meanHeight = totalHeight / 11;

        // Displaying the mean height of the players
        System.out.println("The mean height of the football team is: " + meanHeight);

        // Close the Scanner Object
        input.close();
    }
}
