import java.util.Scanner;

class java3_16 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値a：");
		int a = stdIn.nextInt();
		
		System.out.print("整数値b：");
		int b = stdIn.nextInt();
		
		if (a < b) {
			int t = a;
			a = b;
			b = t;
			System.out.println("a≧bとなるようにソートしました。");
			System.out.println("変数aは"+ a +"です。");
			System.out.println("変数bは"+ b +"です。");
		} else if (a == b) {
			System.out.println("aとbは同じ値です。");
		} else {
			System.out.println("a≧bとなるようにソートしました。");
			System.out.println("変数aは"+ a +"です。");
			System.out.println("変数bは"+ b +"です。");
		}
	}
}