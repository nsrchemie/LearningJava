import java.util.Scanner;

public class InputScanner {

	static void linedemo(){
	String line;
	Scanner console = new Scanner(System.in);
	System.out.println("Enter a string");
	line = console.nextLine();
	System.out.println("Your Input: " + line);
	}
	public static void main(String[] args) {
	linedemo();
	}
}