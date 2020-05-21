import java.util.Scanner;

class java4_12 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");
		int x;
		do {
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
		} while (x <= 0);
		
		for (int y = 0; y <= x; y++) {
			System.out.println(y);
		}
	}
}