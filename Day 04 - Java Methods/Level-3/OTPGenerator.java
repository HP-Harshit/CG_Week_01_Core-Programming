import java.util.Arrays;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random 6-digit number
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to save the OTP numbers generated 10 times
    public static int[] generateOTPs(int count) {
        // Create an array of size count to store otps
        int[] otps = new int[count];
        // Iterating to generate and store otps
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        Arrays.sort(otps); // Sort the array to make comparison easier
        for (int i = 1; i < otps.length; i++) {
            // Check if otps are unique or not
            if (otps[i] == otps[i - 1]) {
                return false; // Found a duplicate OTP
            }
        }
        return true; // All OTPs are unique
    }

    // Method to display the OTP numbers
    public static void displayOTPs(int[] otps) {
        System.out.print("Generated OTP numbers: ");
        for (int otp : otps) {
            System.out.print(otp + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Generate OTP numbers 10 times
        int[] otps = generateOTPs(10);

        // Check if the OTP numbers are unique
        boolean unique = areOTPsUnique(otps);

        // Display the generated OTP numbers
        displayOTPs(otps);
        // Display if the OTP numbers are unique
        System.out.println("Are all OTP numbers unique? " + unique);
    }
}
