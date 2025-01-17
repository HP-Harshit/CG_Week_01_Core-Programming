import java.util.Scanner;

public class FriendsComparison {

    // Method to find the youngest friend
    public int findYoungestFriend(int[] age) {
        int youngestIndex = 0;
        for (int i = 1; i < age.length; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // Method to find the tallest friend
    public int findTallestFriend(int[] height) {
        int tallestIndex = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    // Main method
    public static void main(String[] args) {
        // Create a main class object to call methods
        FriendsComparison classObject = new FriendsComparison();

        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Create arrays for names, ages, and heights
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Take user input for the ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.println("Enter the height (in cm) of " + names[i] + ": ");
            heights[i] = input.nextInt();
        }

        // Call methods to find the youngest and tallest friend
        int youngestIndex = classObject.findYoungestFriend(ages);
        int tallestIndex = classObject.findTallestFriend(heights);
        
        // Display the results
        System.out.println("The youngest friend is " + names[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex]);

        // Close the Scanner object
        input.close();
    }
}
