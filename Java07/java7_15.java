import java.util.Scanner;

public class java7_15 {

	static int sum;
	public static int sumOf(int[] a) {
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] x = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("x["+ i +"]:");
			x[i] = stdIn.nextInt();
		}
		System.out.println("配列aの合計は"+ sumOf(x) +"です。");
	}

}
