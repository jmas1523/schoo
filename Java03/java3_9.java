import java.util.Scanner;

class java3_9 {
	
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����la�F"); int a = stdIn.nextInt();
		System.out.print("�����lb�F"); int b = stdIn.nextInt();
		
		int max;
		if (a > b) {
			max = a;
			System.out.println("�傫���ق��̒l��" + max + "�ł��B");
		} else if (b > a) {
			max = b;
			System.out.println("�傫���ق��̒l��" + max + "�ł��B");
		} else {
			System.out.println("�����l�����͂���܂����B");
		}
	}
}
