import java.util.Scanner;

class java5_4 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("3�̐����̍��v�ƕ��ς����߂܂��B");
		System.out.print("����a�F"); int a = stdIn.nextInt();
		System.out.print("����b�F"); int b = stdIn.nextInt();
		System.out.print("����c�F"); int c = stdIn.nextInt();
		
		int sum = a + b + c;
		double ave = sum / 3.0;
		
		System.out.println("���v��"+ sum +"�ł��B");
		System.out.println("���ς�"+ ave +"�ł��B");
	}
}