public class MulTable {
	public static void main(String[] args) {
		printTable();

	}

	static void printRow(int n) {
		int i = 1;
		while (i <= 6) {
			System.out.printf("%4d", n * i);
			i = i + 1;
		}
		System.out.println();
	}

	static void printTable() {
		int i = 1;
		while (i <= 6) {
			printRow(i);
			i = i + 1;
		}
	}
}