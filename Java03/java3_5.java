import java.util.Scanner;

class java3_5 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���̐����l�F");
		int a = stdIn.nextInt();
		
		if (a <= 0)
			System.out.println("���łȂ��l�����͂���܂����B");
		else if (a%5 == 0)
			System.out.println("���̒l�͂T�Ŋ���؂�܂��B");
		else
			System.out.println("���̒l�͂T�Ŋ���؂�܂���B");
	}
}