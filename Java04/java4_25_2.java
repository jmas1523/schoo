import java.util.Scanner;

class java4_25_2 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���������Z���A���ς����߂܂��B");
		System.out.print("�����Z���܂����F");
		int n = stdIn.nextInt();
		
		int sum = 0;
		double i = 0;
		for (i = 0; i < n; i++) {
			System.out.print("�����F");
			int t = stdIn.nextInt();
			if (sum + t > 1000) {
				System.out.println("���v��1,000�𒴂��܂����B");
				System.out.println("�Ō�̐��l�͖������܂��B");
				break;
			}
			sum += t;
		}
		System.out.println("���v��"+ sum +"�ł��B");
		System.out.println("���ς�"+ sum / i +"�ł��B");
	}
}