import java.util.Scanner;

class java3_14 {
	
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値a；"); int a = stdIn.nextInt();
		System.out.print("整数値b："); int b = stdIn.nextInt();
		
		int min, max;
		
		if (a < b) {
			min = a;
			max = b;
			System.out.println("小さい方の値は"+ min +"です。");
			System.out.println("大きい方の値は"+ max +"です。");
		} else if (a > b) {
			min = b;
			max = a;
			System.out.println("小さい方の値は"+ min +"です。");
			System.out.println("大きい方の値は"+ max +"です。");
		} 
		
		if (a == b){
			System.out.println("二つの値は同じです。");
		}
	}
}
			