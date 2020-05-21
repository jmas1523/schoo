import java.util.Scanner;

class java4_11 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");
		int x;
		do {
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
		} while (x <= 0);
		
		for (int y = x; y >= 0; y--) {
			System.out.println(y);
		}
	}
}