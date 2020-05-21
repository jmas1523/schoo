import java.util.Scanner;

public class java7_11 {
	
	public static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	static int c = 1;
	public static int beki(int a, int b) {
		for (int i = 1; i <= b; i++) {
			c *= 2;
		}
		return c;
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数：");
		int x = stdIn.nextInt();
		
		System.out.print("シフトするビット数：");
		int n = stdIn.nextInt();
		beki(x,n);
		
		System.out.print(  "整数      　= "); printBits(x);
		System.out.print("\nx*(2*n)= "); printBits(x * c);
		System.out.print("\nx/(2*n)= "); printBits(x / c);
		System.out.print("\nx << n = "); printBits(x << n);
		System.out.print("\nx >> n = "); printBits(x >> n);
	}

}
