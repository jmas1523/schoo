import java.util.Scanner;

class java6_13 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f���F");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a["+ i +"] = ");
			a[i] = stdIn.nextInt();
		}
		for (int x = n - 1,i = 0; x >= 0; x--,i++) {
			b[x] = a[i];
		}
		System.out.println("a�̗v�f��b�ɋt���ɃR�s�[���܂����B");
		
		for (int x = 0; x < n; x++) {
			System.out.println("b["+ x +"] = "+ b[x]);
		}
	}
}