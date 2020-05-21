import java.util.Scanner;

class java4_25_1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数を加算し、平均を求めます。");
		System.out.print("何個加算しますか：");
		int n = stdIn.nextInt();
		
		int sum = 0;
		double i;
		for (i = 0; i < n; i++) {
			System.out.print("整数（0で終了）：");
			int t = stdIn.nextInt();
			if (t == 0) break;
			sum += t;
		}
		System.out.println("合計は"+ sum + "です。");
		System.out.println("平均は"+ sum / i +"です。");
	}
}