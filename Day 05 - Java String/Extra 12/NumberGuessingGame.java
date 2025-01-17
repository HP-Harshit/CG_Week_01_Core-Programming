import java.util.Scanner;

public class NumberGuessingGame{
    public static void main(String[] args){

        // Create a Scanner class object
        Scanner input = new Scanner(System.in);

        // Ask user for a number
        System.out.println("Think of a number between 1 and 20");
        int number = input.nextInt();

        // initialize the number of max chances
        int chances = 5;

        // Ask user for a guess
        while(chances!=0){
            int max = 20;
            int min = 1;
            System.out.print("Guess the number: ");
            int guess = (int)(Math.random()*(max-min)) + min;
            System.out.print(guess);
            if(number==guess){
                System.out.println("\nYou guessed it!");
                break;
            } else if (number>guess){
                System.out.println("\nYour guess is too low.");
                min  = guess;
            } else {
                System.out.println("\nYour guess is too high.");
                max = guess;
            }
            chances--;
        }

        // Close the scanner class object\
        input.close();
    }
}