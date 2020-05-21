import java.util.Scanner;

public class java7_9 {

	static int n;
	public static int readPlusInt() {
		do {
			Scanner stdIn = new Scanner(System.in);
			System.out.print("³‚Ì®”’lF"); n = stdIn.nextInt();
		} while (n <= 0);
		return n;

	}
	public static void main(String[] args) {
		readPlusInt();
	}

}
