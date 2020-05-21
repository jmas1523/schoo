import java.util.Scanner;

class java4_3 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®”AF");
		int a = stdIn.nextInt();
		
		System.out.print("®”BF");
		int b = stdIn.nextInt();
		
		if (a > b){
			int t = a;
			a = b;
			b = t;
		}
		
		int x = a;
		do {
			System.out.print(x);
			x++;
			System.out.print(" ");
		} while (x <= b);
	}
}