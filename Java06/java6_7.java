import java.util.Random;
import java.util.Scanner;

class java6_7 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		final int n = 12;
		int[] a = new int[n];
		
		for(int j = 0; j < n; j++) {
			a[j] = rand.nextInt(10);
		}
		System.out.print("配列aの全要素の値\n{ ");
		for (int j = 0; j < n; j++) {
			System.out.print(a[j] +" ");
		}
		System.out.println("}");
		
		System.out.print("探す数値：");
		int key = stdIn.nextInt();
		
		int i;
		int x = 0;
		for (i = 0; i < n; i++) {
			if (a[i] == key) {
				x = i + 1;
			}
		}
		if (x > 0) {
			System.out.println("それはa["+ (x - 1) +"]にあります。");
		} else {
			System.out.println("それはありません。");
		}
	}
}