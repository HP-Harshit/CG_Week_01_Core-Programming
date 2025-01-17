public class DayOfWeek {
    public static void main(String[] args) {

        // Take command-line arguments for month, day, and year
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Calculate y0, x, m0, and d0 using the provided formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        System.out.println(d0);
    }
}
