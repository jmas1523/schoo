import java.util.Scanner;

class java3_2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����`�F");
		int a = stdIn.nextInt();
		
		System.out.print("�����a�F");
		int b = stdIn.nextInt();
		
		if (a%b == 0)
		System.out.println("�a�͂`�̖񐔂ł��B");
		else
		System.out.println("�a�͂`�̖񐔂ł͂���܂���B");
	}
}
