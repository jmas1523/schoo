import java.util.Scanner;

class java4_1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int retry;
		
		do {
			System.out.print("�����l�F");
			int n = stdIn.nextInt();
			
			if (n > 0) {
				System.out.println("���̒l�͐��ł��B");
			} else if (n < 0) {
				System.out.println("���̒l�͕��ł��B");
			} else {
				System.out.println("���̒l��0�ł��B");
			}
			System.out.println("������x�H 1���Yes�^0���No�F");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}