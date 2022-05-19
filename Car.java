package week1.day1;

public class Car {
	
	public void applyBrake() {
		
		System.out.println("Brake Applied");
	}
	
    public void applyGear() {
		
		System.out.println("Gear Applied");
	}
    
    public void switchonAC() {
		
		System.out.println("AC Switched On");
	}
    
    public void applyAccelerate() {
		
		System.out.println("Acceleration Applied");
	}
    
   public static void main(String[] args) {
	   
	   System.out.println("Car Class");
	   
	   Car c = new Car();
	   c.applyBrake();
	   c.applyGear();
	   c.switchonAC();
	   c.applyAccelerate();
   }
}

