import java.util.Scanner;

class java5_1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("10�i�����F");
		int n = stdIn.nextInt();
		
		System.out.printf("8�i���ł� %o\n", n);
		System.out.printf("16�i���ł� %x\n", n);
	}
}