import java.util.Scanner;

public class PythTri{
	public static void main(String[] args) {
		int first;
		int second;
		int third;
		Scanner console = new Scanner(System.in);
		System.out.println("First?");
		first = console.nextInt();
		System.out.println("Second?");
		second = console.nextInt();
		System.out.println("Third?");
		third = console.nextInt();
		if ((Math.pow(first,2) + Math.pow(second,2) == Math.pow(third,2)) || 
			(Math.pow(second,2) + Math.pow(third,2) == Math.pow(first,2)) ||
			(Math.pow(first,2) + Math.pow(third,2) == Math.pow(second,2))) {
			System.out.println("The numbers are a Pythagorean triple!"); }
		else {
			System.out.println("The numbers are not a Pythagorean triple");
		}
}
}