import java.util.Scanner;

class java4_26 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���������Z����B");
		System.out.print("�����Z���܂����F");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i; double x;
		for (i = 0,x = 0; i < n; i++) {
			System.out.print("�����F");
			int t = stdIn.nextInt();
			if (t < 0) {
				System.out.println("���̐��͉��Z���܂���B");
				continue;
			}
			x++;
			sum += t;
		}
		System.out.println("���v��"+ sum +"�ł��B");
		System.out.println("���ς�"+ sum / x +"�ł��B");
	}
}