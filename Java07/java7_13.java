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
		
		System.out.print("整数："); int x = stdIn.nextInt();
		System.out.print("pos何番目（0〜31）；"); int pos = stdIn.nextInt();
		
		System.out.println("pos"+ pos +"番目を１にした値　:"+ set(x,pos));
		System.out.println("pos"+ pos +"番目を0にした値　:"+ reset(x,pos));
		System.out.println("pos"+ pos +"番目を反転した値:"+ inverse(x,pos));
	}

}