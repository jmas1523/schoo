import java.util.Scanner;

class java4_21_1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���㒼�p�̎O�p�`��\�����܂��B");
		System.out.print("�i���́F");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n;  i++) {
			int k =  n - i;
			for (int j = k; j >= 0; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}