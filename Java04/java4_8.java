import java.util.Scanner;

class java4_8 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		do {
			System.out.print("整数値：");
			a = stdIn.nextInt();
		} while (a <= 0);
		
		int x = 1;
		while (a > 10) {
			a /= 10;
			x++;
		}
		System.out.println("その値は"+ x +"桁です。");
	}
}
