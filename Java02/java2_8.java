import java.util.Scanner;
import java.util.Random;

class java2_8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int a = stdIn.nextInt();
		
		Random rand = new Random();
		
		int b = rand.nextInt(11)-5;
		
		System.out.println("その値の±5の乱数を生成しました。それは"+(b+a)+"です。");
	}
}