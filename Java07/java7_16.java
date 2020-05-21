import java.util.Scanner;

public class java7_16 {

	static int min;
	public static int minOf(int[] a) {
		min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("配列aの最小値を求めます。");
		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] x = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("x["+ i +"]:");
			x[i] = stdIn.nextInt();
		}
		System.out.println("配列aの合計は"+ minOf(x) +"です。");
	}

}