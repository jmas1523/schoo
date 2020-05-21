import java.util.Scanner;

class java4_25_2 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数を加算し、平均を求めます。");
		System.out.print("何個加算しますか：");
		int n = stdIn.nextInt();
		
		int sum = 0;
		double i = 0;
		for (i = 0; i < n; i++) {
			System.out.print("整数：");
			int t = stdIn.nextInt();
			if (sum + t > 1000) {
				System.out.println("合計が1,000を超えました。");
				System.out.println("最後の数値は無視します。");
				break;
			}
			sum += t;
		}
		System.out.println("合計は"+ sum +"です。");
		System.out.println("平均は"+ sum / i +"です。");
	}
}