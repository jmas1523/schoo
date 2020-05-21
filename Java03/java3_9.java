import java.util.Scanner;

class java3_9 {
	
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("実数値a："); int a = stdIn.nextInt();
		System.out.print("実数値b："); int b = stdIn.nextInt();
		
		int max;
		if (a > b) {
			max = a;
			System.out.println("大きいほうの値は" + max + "です。");
		} else if (b > a) {
			max = b;
			System.out.println("大きいほうの値は" + max + "です。");
		} else {
			System.out.println("同じ値が入力されました。");
		}
	}
}
