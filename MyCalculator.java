package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		System.out.println("My Calculator");
		
		Calculator cal = new Calculator();
		System.out.println("Addition: "+cal.add(85, 93, 78));
		System.out.println("Subtraction: "+cal.sub(100, 27));
		System.out.println("Multiplication: "+cal.mul(225.7, 5.5));
		System.out.println("Division: "+cal.divide(24.5f, 2.2f));
		
	}
}
