import java.util.Scanner;

class java4_21_1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("左上直角の三角形を表示します。");
		System.out.print("段数は：");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n;  i++) {
			int k =  n - i;
			for (int j = k; j >= 0; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}