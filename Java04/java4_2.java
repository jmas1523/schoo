import java.util.Random;
import java.util.Scanner;

class java4_2 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int n = rand.nextInt(90)+10;
		
		System.out.println("�����ăQ�[���J�n!!");
		System.out.println("10�`99�̐��𓖂ĂĂ��������B");
		
		int x;
		do {
			System.out.print("�������ȁF");
			x = stdIn.nextInt();
			
			if (x > n) {
				System.out.println("�����Ə����Ȑ�������B");
			} else if (x < n) {
				System.out.println("�����Ƒ傫�Ȑ�������B");
			} 
		} while (x != n);
			
			System.out.println("�����ł��B");
	}
}
