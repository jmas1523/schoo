import java.util.Scanner;

public class java7_12 {
	
	static int a; static int b;
	public static int rRotate(int x, int n) {
		a = x >>> n | x << (32 - n);
		return a;
	}
	
	public static int lRotate(int x, int n) {
		b = x << n | x >>> (32 - n);
		return b;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数："); int x = stdIn.nextInt();
		System.out.print("回転するビット数；"); int n = stdIn.nextInt();
		
		System.out.println("右に回転した値："+ rRotate(x,n));
		System.out.println("左に回転した値："+ lRotate(x,n));
	}

}
