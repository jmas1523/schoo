import java.util.Random;
import java.util.Scanner;

class java4_27 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(100);
		
		System.out.println("�����ăQ�[���J�n!!");
		System.out.println("0�`99�̐��𓖂ĂĂ��������B");
		
		int x;int y = 0;
	 Outer:
		
		do {
			System.out.print("�������ȁF");
			x = stdIn.nextInt();
			
			if (x > no) {
				System.out.println("�����Ə����Ȑ�����B");
			} else if (x < no) {
				System.out.println("�����Ƒ傫�Ȑ�����B");
			}
			y++;
			if (y == 10) {
				System.out.println("������"+ no + "�ł��B");
				break Outer;
			} else if (x == no) {
				System.out.println("�����ł��B");
				break Outer;
			}
		} while (x != no);
	}
}