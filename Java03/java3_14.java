import java.util.Scanner;

class java3_14 {
	
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����la�G"); int a = stdIn.nextInt();
		System.out.print("�����lb�F"); int b = stdIn.nextInt();
		
		int min, max;
		
		if (a < b) {
			min = a;
			max = b;
			System.out.println("���������̒l��"+ min +"�ł��B");
			System.out.println("�傫�����̒l��"+ max +"�ł��B");
		} else if (a > b) {
			min = b;
			max = a;
			System.out.println("���������̒l��"+ min +"�ł��B");
			System.out.println("�傫�����̒l��"+ max +"�ł��B");
		} 
		
		if (a == b){
			System.out.println("��̒l�͓����ł��B");
		}
	}
}
			