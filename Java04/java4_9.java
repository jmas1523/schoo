import java.util.Scanner;

class java4_9 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("nの値：");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		int x = 1;
		int i = 1;
		
		while (i <= n) {
			x *= i;
			i++;
			
		}
		System.out.println("1から"+ n +"までの積は"+ x +"です。");
	}
}
