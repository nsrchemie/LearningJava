public class MulTable {
	public static void main(String[] args) {
		printRow();
		System.out.println();
	}

	static void printRow() {
		int i = 1;
		while (i <= 6) {
			System.out.printf("%4d", 2 * i);
			i = i + 1;
		}
	}
}