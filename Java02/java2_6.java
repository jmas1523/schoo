import java.util.Scanner;
class java2_6 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�O�p�`�̖ʐς����߂܂��B");
		
		System.out.print("���:");
		double x = stdIn.nextDouble();
		System.out.print("����:");
		double y = stdIn.nextDouble();
		
		System.out.println("�ʐς�"+(x * y)/2+"�ł��B");
	}
}