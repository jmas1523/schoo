import java.util.Scanner;

class java6_6 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("人数は：");
		int n = stdIn.nextInt();
		int[] t = new int[n];
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) +"番の点数：");
			t[i] = stdIn.nextInt();
			sum += t[i];
		}
		int max = t[0]; int min = t[0];
		for (int i = 1; i < t.length; i++) {
			if (t[i] > max) {
				max = t[i];
			} else if (t[i] < min) {
				min = t[i];
			}
		}
		System.out.println("合計点は"+ sum +"です。");
		System.out.println("平均点は"+ (double)sum / n +"です。");
		System.out.println("最高点は"+ max +"です。");
		System.out.println("最低点は"+ min +"です。");
	}
}