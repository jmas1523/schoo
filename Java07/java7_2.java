import java.util.Scanner;

public class java7_2 {

	static int min(int a, int b, int c) {
		int min = a;
		if (b < min) {
			min = b;
		} 
		if (c < min) {
			min = c;
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a�F"); int a = stdIn.nextInt();
		System.out.print("����b�F"); int b = stdIn.nextInt();
		System.out.print("����c�F"); int c = stdIn.nextInt();
		
		System.out.println("�ŏ��l��"+ min(a,b,c) +"�ł��B");
	}

}
