import java.util.Scanner;

public class java7_12 {
	
	static int a; static int b;
	public static int rRotate(int x, int n) {
		a = x >>> n | x << (32 - n);
		return a;
	}
	
	public static int lRotate(int x, int n) {
		b = x << n | x >>> (32 - n);
		return b;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����F"); int x = stdIn.nextInt();
		System.out.print("��]����r�b�g���G"); int n = stdIn.nextInt();
		
		System.out.println("�E�ɉ�]�����l�F"+ rRotate(x,n));
		System.out.println("���ɉ�]�����l�F"+ lRotate(x,n));
	}

}
