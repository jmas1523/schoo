import java.util.Scanner;

class java3_11 {
	
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����lA�F"); int A = stdIn.nextInt();
		System.out.print("�����lB�F"); int B = stdIn.nextInt();

		int x = A - B;
		int y = B - A;
		int dif = A < B ? y : x;
		if (dif <= 10) {
			System.out.println("�����̍���10�ȉ��ł��B");
		} else {
			System.out.println("�����̍���11�ȏ�ł��B");
		}
	}
}
