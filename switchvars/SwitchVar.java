public class SwitchVar{
	public static void main(String[] args){
	twovars();
	}

	static void twovars() {
		int x = 1;
		int y = 2;
		int temp;
		System.out.println("Initial values are x:" + x + " y:" + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("Switched! x:" + x + " y:" + y);
	}
}