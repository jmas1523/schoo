import java.util.Scanner;

class java4_4 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");
		int x;
		do {
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
		} while (x <= 0);
		
		while (x >= 0) {
			System.out.println(x);
			x--;
		}
		
		System.out.println("終了時のｘの値は"+ x +"です。");
	}
}