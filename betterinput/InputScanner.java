import java.util.Scanner;

public class InputScanner {

	static void linedemo(){
	String line;
	Scanner console = new Scanner(System.in);
	System.out.println("Enter a string");
	line = console.nextLine();
	System.out.println("Your Input: " + line);
	}

	static void intdemo(){
		double inch;
		double cm;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter length in inches to convert to centimeters");
		inch = console.nextFloat();
		final double conv = 2.54;
		cm = inch * conv;
		System.out.println(inch + " inches are equal to " + cm + " centimeters");
	
	}
	public static void main(String[] args) {
	intdemo();
	}
}