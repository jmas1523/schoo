import java.util.Scanner;

class java3_4 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�ϐ�a�F");
		int a = stdIn.nextInt();
		
		System.out.print("�ϐ�b�F");
		int b = stdIn.nextInt();
		
		if (a > b)
			System.out.println("a�̂ق����傫���ł��B");
		else if (a < b)
			System.out.println("b�̂ق����傫���ł��B");
		else if (a == b)
			System.out.println("a��b�͓����l�ł��B");
	}
}
