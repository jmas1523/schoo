import java.util.Scanner;

class java4_15 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		do {
		System.out.print("���p����F");
		a = stdIn.nextInt();
		System.out.print("���p�܂ŁF");
		b = stdIn.nextInt();
		System.out.print("���p���ƁF");
		c = stdIn.nextInt();
		} while (a <= 100 || a > b || c <= 0);
		
		System.out.println("�g���@�W���̏d");
		
		for (;a <= b;a += c) {
			double x = (a - 100)*0.9;
			System.out.print(a+"   ");
			System.out.println(x);
		}
	}
}