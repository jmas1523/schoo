import java.util.Scanner;

class java3_13 {
	
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����la�F"); int a = stdIn.nextInt();
		System.out.print("�����lb�F"); int b = stdIn.nextInt();
		System.out.print("�����lc�F"); int c = stdIn.nextInt();
		
		int x;
		if (a > b) {
			x = a;
			a = b;
			b = x;
		}
		if (b > c) {
			x = b;
			b = c;
			c = x;
		}
		if (a > b) {
			x = a;
			a = b;
			b = x;
		}
		System.out.println("�����l�̒l��"+ b +"�ł��B");
	}
}