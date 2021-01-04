package Interview;

public class Test {
	public static void main(String[] args) {
		printStairs(5);
	}

	public static void printStairs(int n) {
		if (n < 1) {
			System.out.println("n要大於0");
		}

		for (int i = 0; i < n; i++) { // 第一層迴圈負責印斷行(\n)
			for (int k = (n - 1); k > i; k--) { // 第二層迴圈負責印空白( )
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) { // 第二層迴圈負責印星號(*)
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}