import java.util.Scanner;

class java4_14 {
	
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
			if (i == 1) {
				System.out.print(" ");
			} else if (i <= n) {
				System.out.print(" + ");
			} else {
				System.out.print(" ");
			}
			sum += i;
			System.out.print(i);
		}
		System.out.println(" = "+ sum);
	}
}