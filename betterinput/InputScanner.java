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
		int inch;
		double cm;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter length in inches to convert to centimters");
	}
	public static void main(String[] args) {
	linedemo();
	}
}