import java.util.Scanner;

class java4_18 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("nの値：");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int x = i * i;
			System.out.println(i +"の2乗は"+ x);
		}
	}
}
