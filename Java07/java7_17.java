import java.util.Scanner;

public class java7_17 {
	
	public static int linearSearchR(int[] a, int key, int num) {
		for (int i = num - 1; i >= 0; i--) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f���F"); int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x["+ i +"]:");
			x[i] = stdIn.nextInt();
		}
		System.out.print("�T���l�F");
		int ky = stdIn.nextInt();
		
		int idk = linearSearchR(x, ky, num);
		
		if (idk == -1) {
			System.out.println("���̒l�̗v�f�͑��݂��܂���B");
		} else {
			System.out.println("���̒l��x["+ idk +"]�ɂ���܂��B");
		}
	}

}