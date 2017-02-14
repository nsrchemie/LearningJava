import java.util.Scanner;

public class NumCompare {
	public static void main(String[] args) {
		int first;
		int second;
		int third;
		int max;
		Scanner console = new Scanner(System.in);
		System.out.println("First Number?");
		first = console.nextInt();
		max = first;
		System.out.println("Second Number?");
		second = console.nextInt();
		System.out.println("First Number?");
		third = console.nextInt();							
		System.out.println("you typed in " + first + " " + second + " and " + third);
		if (second > max) {
			max = second;
		}
		if (third > max ) {
			max = third;
		}
		System.out.println("Highest number is " + max);

	}
}