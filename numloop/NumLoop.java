import java.util.Scanner;

public class NumLoop {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int max;
		System.out.println("Enter number.");
		max = console.nextInt();
		for (int count = 1; max >= count; max--) {
			System.out.println(max);
		}
	}
}