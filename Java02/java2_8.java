import java.util.Scanner;
import java.util.Random;

class java2_8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int a = stdIn.nextInt();
		
		Random rand = new Random();
		
		int b = rand.nextInt(11)-5;
		
		System.out.println("���̒l�́}5�̗����𐶐����܂����B�����"+(b+a)+"�ł��B");
	}
}