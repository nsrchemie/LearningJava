import java.util.Scanner;

public class TimeCalc {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter seconds");
		int sec = console.nextInt();
		int min = sec/60;
		int rem = sec%60;
		System.out.println(sec + "seconds is converted to " + min + " minutes and " + rem + " seconds");
	}
}