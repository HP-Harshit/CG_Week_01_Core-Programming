import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {

        // create a scanner object to take an input from the user
        Scanner input = new Scanner(System.in);

        // Create an Array for age and height of size 3
        int[] ageArray = new int[3];
        int[] heightArray = new int[3];

        // create a name array to indicate the person
        String[] name = {"Amar", "Akbar", "Anthony"};

        // take user input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the age of " + name[i]);
            ageArray[i] = input.nextInt();
            System.out.println("Enter the height of " + name[i]);
            heightArray[i] = input.nextInt();
        }

        // iterating through the loop
        int minAge = ageArray[0], maxHeight = heightArray[0], ageIndex = 0, heightIndex = 0;
        for (int i = 1; i < 3; i++) {
            // finding the minimum age
            if (minAge > ageArray[i]) {
                minAge = ageArray[i];
                ageIndex = i;
            }

            // finding the tallest height
            if (maxHeight < heightArray[i]) {
                maxHeight = heightArray[i];
                heightIndex = i;
            }
        }

        String youngestFriend = name[ageIndex];
        String tallestFriend = name[heightIndex];

        // displaying the result
        System.out.println("The youngest friend is: " + youngestFriend +
                           "\nThe tallest friend is: " + tallestFriend);

        // Close the Scanner Object
        input.close();
    }
}
