import java.util.Random;
import java.util.Scanner;

class java6_4 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("—v‘f”F");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(10)+ 1;
		}
		for (int x = 10; x >= 1; x--) {
			for (int i = 0; i < n; i++) {
				if (a[i] >= x) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < n - 1; i++) {
			System.out.print("--");
		}
		System.out.println("-");
		for (int i = 0; i < n; i++) {
			System.out.print(i % 10 +" ");
		}
	}
}