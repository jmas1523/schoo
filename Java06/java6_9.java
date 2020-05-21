import java.util.Random;
import java.util.Scanner;

class java6_9 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a  = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(10)+1;
			if (i  == 0) {
				System.out.print("{"+ a[i] +"，");
			} else if (i == n - 1) {
				System.out.print(a[i] +"}");
			} else {
				System.out.print(a[i] +"，");
			}
		}
	}
}