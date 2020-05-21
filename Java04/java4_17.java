import java.util.Scanner;

class java4_17 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®”’lF");
		int n = stdIn.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				sum++;
			}
		}
		System.out.println("–ñ”‚Í"+ sum +"ŒÂ‚Å‚·B");
	}
}