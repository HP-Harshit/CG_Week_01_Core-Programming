public class Volume {
    public static void main(String[] args) {

        // create a variable to indicate radius in km
        double radiusKm = 6378;


        // create a variable to indicate pi
        double pi = 3.14;

        // create a variable to indicate volume
        double volumeInKilometer = (4.0 / 3.0) * pi * (radiusKm * radiusKm * radiusKm);

	// create a variable indicate radius in miles
	double radiusMiles = radiusKm * 0.621371;

        // create a variable to indicate volume in miles
        double volumeInMiles = (4.0 / 3.0) * pi * (radiusMiles * radiusMiles * radiusMiles);

        // print the detail
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKilometer + " and cubic miles is " + volumeInMiles);
    }
}