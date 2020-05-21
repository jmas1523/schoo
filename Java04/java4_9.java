import java.util.Scanner;

class java4_9 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("n‚Ì’lF");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		int x = 1;
		int i = 1;
		
		while (i <= n) {
			x *= i;
			i++;
			
		}
		System.out.println("1‚©‚ç"+ n +"‚Ü‚Å‚ÌÏ‚Í"+ x +"‚Å‚·B");
	}
}
