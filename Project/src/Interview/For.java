package Interview;

public class For {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 5; i++) {//內層
			for (int m = 0; m < 5 - i; m++) {//空白部分
				System.out.print(" ");
			}
			for (int j = 0; j <= i ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
