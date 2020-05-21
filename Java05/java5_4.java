import java.util.Scanner;

class java5_4 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("3つの整数の合計と平均を求めます。");
		System.out.print("整数a："); int a = stdIn.nextInt();
		System.out.print("整数b："); int b = stdIn.nextInt();
		System.out.print("整数c："); int c = stdIn.nextInt();
		
		int sum = a + b + c;
		double ave = sum / 3.0;
		
		System.out.println("合計は"+ sum +"です。");
		System.out.println("平均は"+ ave +"です。");
	}
}