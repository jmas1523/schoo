import java.util.Scanner;

public class java7_1 {

	static int signOf(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®”’lF"); int n = stdIn.nextInt();
		
		System.out.println(signOf(n));
	}

}