import java.util.Scanner;

class java4_24 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�f�������f���܂��B");
		System.out.print("�����l�F");
		int n = stdIn.nextInt();
		
		int x = 0;
		for (int y = 2,a = 1; y < n; y++) {
			a = n % y;
			if (a == 0) {
				x++;
			}
			if (x == 1) {
				System.out.println("�f���ł͂���܂���B");
				break;
			}
		}
		if (n <= 1) {
			System.out.println("�f���ł͂���܂���B");
		} else if (x < 1) {
			System.out.println("�f���ł��B");
		}
	}
}