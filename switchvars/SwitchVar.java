public class SwitchVar{
	public static void main(String[] args){
	notemp();
	}

	static void withtemp() {
		int x = 1;
		int y = 2;
		int temp;
		System.out.println("Initial values are x:" + x + " y:" + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("Switched with temp! x:" + x + " y:" + y);
	}

	static void notemp() {
		int x = 1;
		int y = 2;
		System.out.println("Initial values are x:" + x + " y:" + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Switched without temp! x:" + x + " y:" + y);
	}

}