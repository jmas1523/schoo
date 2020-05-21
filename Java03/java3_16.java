import java.util.Scanner;

class java3_16 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値a：");
		int a = stdIn.nextInt();
		
		System.out.print("整数値b：");
		int b = stdIn.nextInt();
		
		System.out.print("整数値c：");
		int c = stdIn.nextInt();
		
		int t;
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		if (b > c) {
			t = b;
			b = c;
			c = t;
		}
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		System.out.println("a≦b≦cとなるようにソートしました。");
		System.out.println("整数aは"+ a +"、整数bは"+ b +"、整数cは"+ c +"です。");
	}
}