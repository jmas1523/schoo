import java.util.Scanner;

class java4_20 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("n’i‚Ì³•ûŒ`F");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		for (int i =1; i <= n; i++) {
			int j = 1;
			for (; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}