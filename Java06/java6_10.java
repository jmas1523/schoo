import java.util.Random;
import java.util.Scanner;

class java6_10 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f���F");
		int n = stdIn.nextInt();
		int[] a  = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(10)+1;
			if (i == 0) {
				System.out.print("{"+ a[i]);
			} else if (a[i] == a[(i-1)]) {
				if (a[i] == 10) {
					a[i] -= 1;
					System.out.print("�C"+ a[i]);
				} else  {
					a[i] += 1;
					System.out.print("�C"+ a[i]);
				}
			} else {
				System.out.print("�C"+ a[i]);
			}
		}
		System.out.print("}");
	}
}