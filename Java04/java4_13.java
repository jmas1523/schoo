import java.util.Scanner;

class java4_13 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1からnまでの和を求めます。");
		int n;
		do {
			System.out.print("nの値：");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		int sum = 0;
		
		for (int i = 1;i <= n;i++) {
			sum += i;
		}
		System.out.println("1から"+ n +"までの和は"+ sum +"です。");
	}
}