import java.util.Scanner;

class java6_6 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�l���́F");
		int n = stdIn.nextInt();
		int[] t = new int[n];
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) +"�Ԃ̓_���F");
			t[i] = stdIn.nextInt();
			sum += t[i];
		}
		int max = t[0]; int min = t[0];
		for (int i = 1; i < t.length; i++) {
			if (t[i] > max) {
				max = t[i];
			} else if (t[i] < min) {
				min = t[i];
			}
		}
		System.out.println("���v�_��"+ sum +"�ł��B");
		System.out.println("���ϓ_��"+ (double)sum / n +"�ł��B");
		System.out.println("�ō��_��"+ max +"�ł��B");
		System.out.println("�Œ�_��"+ min +"�ł��B");
	}
}