import java.util.Scanner;

class java3_16 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����la�F");
		int a = stdIn.nextInt();
		
		System.out.print("�����lb�F");
		int b = stdIn.nextInt();
		
		System.out.print("�����lc�F");
		int c = stdIn.nextInt();
		
		int t;
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		if (b > c) {
			t = b;
			b = c;
			c = t;
		}
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		System.out.println("a��b��c�ƂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("����a��"+ a +"�A����b��"+ b +"�A����c��"+ c +"�ł��B");
	}
}