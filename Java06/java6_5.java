import java.util.Scanner;

class java6_5 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("—v‘f”F");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a["+ i +"] = ");
			a[i] = stdIn.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print("a =o" + a[i] +"C" );
			} else if (i == n -1) {
				System.out.print(a[i] +"p");
			} else {
				System.out.print(a[i] +"C");
			}
		}
	}
}