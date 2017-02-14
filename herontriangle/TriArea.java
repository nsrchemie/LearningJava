import java.util.Scanner;

public class TriArea{
	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.println("First side?");
	double first = console.nextDouble();
	System.out.println("Second side?");
	double second = console.nextDouble();
	System.out.println("Third side?");
	double third = console.nextDouble();
	double s = (first+second+third)/2;
	double area = Math.sqrt((s*(s-first)*(s-second)*(s-third)));
	System.out.println("area is " + area);
	}
}