import java.util.Scanner;

class java4_25_1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���������Z���A���ς����߂܂��B");
		System.out.print("�����Z���܂����F");
		int n = stdIn.nextInt();
		
		int sum = 0;
		double i;
		for (i = 0; i < n; i++) {
			System.out.print("�����i0�ŏI���j�F");
			int t = stdIn.nextInt();
			if (t == 0) break;
			sum += t;
		}
		System.out.println("���v��"+ sum + "�ł��B");
		System.out.println("���ς�"+ sum / i +"�ł��B");
	}
}