import java.util.Scanner;

public class InputCheck {

public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.print("Enter a number: ");
	if (!console.hasNextDouble()) {
		String word = console.next();
		System.err.println(word + " is NOT a number!");
		return;
	}
	double in = console.nextDouble();
	System.out.println("You entered " + in);

}
}