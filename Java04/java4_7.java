import java.util.Scanner;

class java4_7 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("‰½ŒÂ•\¦‚µ‚Ü‚·‚©F");
		int n = stdIn.nextInt();
		
		int i = 0;
		while (i < n) {
			if (i % 2 == 1) {
				System.out.print('+');
			} else {
				System.out.print('*');
			}
			i++;
		}
		System.out.print("");
	}
}