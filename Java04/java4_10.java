import java.util.Scanner;

class java4_10 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����*��\�����܂����F");
		int n = stdIn.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print('*');
		}
		System.out.print("");
	}
}