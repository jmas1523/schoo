import java.util.Scanner;

class java3_12 {
	
	public static void main(String [] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����la�F"); int a = stdIn.nextInt();
		System.out.print("�����lb�F"); int b = stdIn.nextInt();
		System.out.print("�����lc�F"); int c = stdIn.nextInt();
		
		int min = a;
		if (b < min) { min = b;
		}
		if (c < min) { min = c;
		}
		System.out.println("�ŏ��l��"+ min +"�ł��B");
	}
}