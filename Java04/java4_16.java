import java.util.Scanner;

class java4_16 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("‰½ŒÂ*‚ğ•\¦‚µ‚Ü‚·‚©F");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i % 5 != 0) {
				System.out.print('*');
			} else {
				System.out.println('*');
			}
		}
	}
}