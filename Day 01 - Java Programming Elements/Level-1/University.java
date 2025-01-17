public class University {
    public static void main(String[] args) {

        // create a variable to indicate fee
        double fee = 125000;

        // create a variable to indicate discount percent
        double discountPercent = 10;

        // create a variable to indicate discount
        double discount = fee * (discountPercent / 100.0);

        // create a variable to indicate fee to pay
        double feeToPay = fee - discount;

        // print the detail
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + feeToPay);
    }
}
