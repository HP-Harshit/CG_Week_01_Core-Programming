import java.util.Scanner;

public class DeckOfCards {

    // Method to get suits of the cards
    public static String[] getSuits() {
        // Return the suits of the cards
        return new String[] { "Hearts", "Diamonds", "Clubs", "Spades" };
    }

    // Method to get ranks of the cards
    public static String[] getRanks() {
        // Return the ranks of the cards
        return new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    }

    // Method to get number of cards
    public static int getNumberOfCards() {
        String[] suits = getSuits();
        String[] ranks = getRanks();
        // Return the total number of cards
        return suits.length * ranks.length;
    }

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = getSuits();
        String[] ranks = getRanks();
        int numOfCards = getNumberOfCards();
        // Initialize the deck of cards
        String[] deck = new String[numOfCards];
        int index = 0;
        // Loop through each suit and rank to create the deck
        for (String suit : suits) {
            for (String rank : ranks) {
                // Add the card to the deck
                deck[index++] = rank + " of " + suit;
            }
        }
        // Return the deck of cards
        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            // Generate a random index to swap with
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            // Swap the cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute the deck of n cards to x number of players
    public static String[][] distributeCards(String[] deck, int n, int x) {
        // Calculate the number of cards each player will get
        int totalCardsNeeded = n * x;
        // Check if the deck has enough cards
        if (totalCardsNeeded > deck.length) {
            System.out.println("Not enough cards in the deck to distribute " + n + " cards to " + x + " players.");
            return null;
        }

        // Initialize the array to hold the cards for each player
        String[][] players = new String[x][n];
        int index = 0;
        // Loop through each player and distribute the cards
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                // Add the card to the player's hand
                players[i][j] = deck[index++];
            }
        }
        // Return the array of cards for each player
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersAndCards(String[][] players) {
        if (players == null) {
            // If the players array is null, print a message
            return;
        }
        // Loop through each player and print their cards
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            // Loop through each card in the player's hand
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            // Print a newline after each player's hand
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create a scanner class object
        Scanner input = new Scanner(System.in);

        // Initialize the deck
        String[] deck = initializeDeck();

        // Shuffle the deck
        shuffleDeck(deck);

        // Take user input for the number of cards and the number of players
        System.out.println("Enter the number of cards to distribute to each player: ");
        int n = input.nextInt();
        System.out.println("Enter the number of players: ");
        int x = input.nextInt();

        // Distribute the cards to the players
        String[][] players = distributeCards(deck, n, x);

        // Print the players and their cards
        printPlayersAndCards(players);

        // Close the Scanner object
        input.close();
    }
}
