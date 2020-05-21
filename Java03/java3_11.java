import java.util.Scanner;

class java3_11 {
	
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値A："); int A = stdIn.nextInt();
		System.out.print("整数値B："); int B = stdIn.nextInt();

		int x = A - B;
		int y = B - A;
		int dif = A < B ? y : x;
		if (dif <= 10) {
			System.out.println("それらの差は10以下です。");
		} else {
			System.out.println("それらの差は11以上です。");
		}
	}
}
