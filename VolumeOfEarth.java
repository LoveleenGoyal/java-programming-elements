public class VolumeOfEarth {
	public static void main(String[] args){
		// Given radius of earth in KMs
		double radius = 6378;
		double pi = Math.PI;
		double conversionFactor = 1.6 * 1.6 * 1.6;
		
		double volumeOfEarthInKms = (4/3.0) * pi * Math.pow(radius,3.0);
		double volumeOfEarthInMiles = volumeOfEarthInKms / conversionFactor;
		
		System.out.print("The volume of earth in cubic kilometers is " + volumeOfEarthInKms + " and cublic miles is " + volumeOfEarthInMiles);
	}
}