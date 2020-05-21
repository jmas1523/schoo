import java.util.Scanner;

public class java7_14 {

	static int a = 0;
	public static int setN(int x, int pos, int n) {
		for (int i = 0; i < n; i++) {
			a = a | 1 << pos + i;
		}
		a = a | x;
		return a;
	}	
	static int b = 0;
	public static int resetN(int x, int pos, int n) {
		for (int i = 0; i < n; i++) {
			b = b | 1 << pos + i;
		}
		b = b ^ setN(x, pos, n);
		return b;
	}
	static int c = 0;
	public static int inverseN(int x, int pos, int n) {
		for (int i = 0; i < n; i++) {
			c = c | 1 << pos + i;
		}
		c = c ^ x;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数："); int x = stdIn.nextInt();
		System.out.print("pos何番目（0～31）；"); int pos = stdIn.nextInt();
		System.out.print("何個のビット："); int n = stdIn.nextInt();
		
		System.out.println("pos"+ pos +"番目から左に連続する"+ n +"個を１にした値　:"+ setN(x,pos,n));
		System.out.println("pos"+ pos +"番目から左に連続する"+ n +"個を0にした値　:"+ resetN(x,pos,n));
		System.out.println("pos"+ pos +"番目から左に連続する"+ n +"個を反転した値:"+ inverseN(x,pos,n));
	}

}