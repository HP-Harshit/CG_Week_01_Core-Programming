import java.util.Scanner;

public class TravelComputation {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the name of the person traveling
        System.out.print("Enter the name of the person traveling: ");
        String name = input.nextLine();

        // Take user input for the cities
        System.out.print("Enter the from city: ");
        String fromCity = input.nextLine();

        // Take user input for the via city
        System.out.print("Enter the via city: ");
        String viaCity = input.nextLine();

        // Take user input for the destination city
        System.out.print("Enter the destination city: ");
        String toCity = input.nextLine();

        // Take user input for the distance from fromCity to viaCity in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (miles): ");
        double distanceFromToVia = input.nextDouble();

        // Take user input for the time taken from fromCity to viaCity in minutes
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (minutes): ");
        int timeFromToVia = input.nextInt();

        // Take user input for the distance from viaCity to toCity in miles
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (miles): ");
        double distanceViaToFinalCity = input.nextDouble();

        // Take user input for the time taken from viaCity to toCity in minutes
        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (minutes): ");
        int timeViaToFinalCity = input.nextInt();

        // Calculate the total distance
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        // Calculate the total time taken
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the travel details
        System.out.println("The Total Distance travelled by " + name + " from " + 
                           fromCity + " to " + toCity + " via " + viaCity +
                           " is " + totalDistance + " miles and " +
                           "the Total Time taken is " + totalTime + " minutes.");

        // Close the scanner
        input.close();
    }
}
