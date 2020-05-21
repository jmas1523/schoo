import java.util.Scanner;

class java3_13 {
	
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値a："); int a = stdIn.nextInt();
		System.out.print("整数値b："); int b = stdIn.nextInt();
		System.out.print("整数値c："); int c = stdIn.nextInt();
		
		int x;
		if (a > b) {
			x = a;
			a = b;
			b = x;
		}
		if (b > c) {
			x = b;
			b = c;
			c = x;
		}
		if (a > b) {
			x = a;
			a = b;
			b = x;
		}
		System.out.println("中央値の値は"+ b +"です。");
	}
}