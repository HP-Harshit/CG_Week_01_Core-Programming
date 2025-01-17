public class FootballTeamHeightAnalysis {

    // Method to generate an array of random heights in the range 150 to 250 cm
    public static int[] generateHeights(int size) {
        // Create an array to store the heights
        int[] heights = new int[size];
        // Generate random 3-digit heights
        for (int i = 0; i < size; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // Generate random height between 150 and 250 cm
        }
        return heights;
    }

    // Method to find the sum of all elements in the array
    public static int findSum(int[] heights) {
        // Create a variable to indicate the sum of height
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height of the players
    public static double findMean(int[] heights) {
        // Find the sum of all heights
        int sum = findSum(heights);
        // Find the mean height by dividing the sum by the number of players
        return (double) sum / heights.length;
    }

    // Method to find the shortest height of the players
    public static int findShortest(int[] heights) {
        // Initialize the shortest height to the first height in the array
        int shortest = heights[0];
        // Iterate through the array to find the shortest height
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height of the players
    public static int findTallest(int[] heights) {
        // Initialize the tallest height to the first height in the array
        int tallest = heights[0];
        // Iterate through the array to find the tallest height
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    // Main Method
    public static void main(String[] args) {
        int size = 11; // Size of the football team

        // Generate random heights for the football team
        int[] heights = generateHeights(size);

        // Find the sum, mean, shortest, and tallest heights
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display the results
        System.out.println("Heights of the players in the football team:");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\nSum of heights: " + sum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }
}
