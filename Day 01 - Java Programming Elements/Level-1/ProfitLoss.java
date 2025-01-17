public class ProfitLoss{
	public static void main(String[] args){

		// create a variable to indicate cost price
		int costPrice = 129;

		// create a variable to indicate selling price
		int sellingPrice = 191;

		// create a variable to indicate profit
		int profit = sellingPrice - costPrice;

		// create a variable to indicate profit percentage
		double profitPercentage = (double)profit / (double)costPrice * 100;

		// print the detail
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);

	}
}