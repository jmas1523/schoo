import java.util.Scanner;

class java5_1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("10進整数：");
		int n = stdIn.nextInt();
		
		System.out.printf("8進数では %o\n", n);
		System.out.printf("16進数では %x\n", n);
	}
}