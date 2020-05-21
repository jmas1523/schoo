import java.util.Scanner;

class java4_15 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		do {
		System.out.print("何㎝から：");
		a = stdIn.nextInt();
		System.out.print("何㎝まで：");
		b = stdIn.nextInt();
		System.out.print("何㎝ごと：");
		c = stdIn.nextInt();
		} while (a <= 100 || a > b || c <= 0);
		
		System.out.println("身長　標準体重");
		
		for (;a <= b;a += c) {
			double x = (a - 100)*0.9;
			System.out.print(a+"   ");
			System.out.println(x);
		}
	}
}