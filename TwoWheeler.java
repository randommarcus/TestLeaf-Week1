package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 79847708;
	boolean isPunctured = false;
	String bikeName = "Honda Activa";
	double runningKM = 10500.25;
	
	public static void main (String[] args) {
		
		TwoWheeler myTW = new TwoWheeler();
		
		System.out.println("Number of wheels: "+myTW.noOfWheels);
		System.out.println("Number of mirrors: "+myTW.noOfMirrors);
		System.out.println("Chassis number: "+myTW.chassisNumber);
		System.out.println("Is punctured?: "+myTW.isPunctured);
		System.out.println("Vehicle name: "+myTW.bikeName);
		System.out.println("Running KM: "+myTW.runningKM);
	}
}
