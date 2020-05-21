import java.util.Scanner;

public class java7_13 {
	
	static int a; static int b; static int c;
	public static int set(int x, int pos) {
		a = 1 << pos | x;
		return a;
	}
	
	public static int reset(int x, int pos) {
		b = 1 << pos ^ set(x, pos);
		return b;
	}
	public static int inverse(int x, int pos) {
		c = 1 << pos ^ x;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®”F"); int x = stdIn.nextInt();
		System.out.print("pos‰½”Ô–Úi0`31jG"); int pos = stdIn.nextInt();
		
		System.out.println("pos"+ pos +"”Ô–Ú‚ğ‚P‚É‚µ‚½’l@:"+ set(x,pos));
		System.out.println("pos"+ pos +"”Ô–Ú‚ğ0‚É‚µ‚½’l@:"+ reset(x,pos));
		System.out.println("pos"+ pos +"”Ô–Ú‚ğ”½“]‚µ‚½’l:"+ inverse(x,pos));
	}

}