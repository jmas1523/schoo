import java.util.Scanner;

public class java7_16 {

	static int min;
	public static int minOf(int[] a) {
		min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�z��a�̍ŏ��l�����߂܂��B");
		System.out.print("�v�f���F");
		int n = stdIn.nextInt();
		int[] x = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("x["+ i +"]:");
			x[i] = stdIn.nextInt();
		}
		System.out.println("�z��a�̍��v��"+ minOf(x) +"�ł��B");
	}

}