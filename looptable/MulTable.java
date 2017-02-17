public class MulTable {
	public static void main(String[] args) {
		printTable(10);

	}

	static void printRow(int n , int cols) {
		int i = 1;
		while (i <= cols) {
			System.out.printf("%4d", n * i);
			i = i + 1;
		}
		System.out.println();
	}

	static void printTable(int rows) {
		int i = 1;
		while (i <= rows) {
			printRow(i, rows);
			i = i + 1;
		}
	}
}