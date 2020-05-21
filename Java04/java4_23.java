import java.util.Scanner;

class java4_23 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("n段の数字ピラミッドを表示します。");
		System.out.print("段数は：");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int x = (n - 1)* 2 + 1;
			for (int j = 1; j <= x; j++) {
				int y = (i - 1)* 2 + 1;
				if (j <= (x - y)/2 || j > x- ((x - y)/2)) {
					System.out.print(" ");
				} else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
}