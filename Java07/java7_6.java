import java.util.Scanner;

public class java7_6 {

	public static void printSeason(String m) {
		System.out.println(m +"�ł��B");
	}
	public static void season(int m) {
		if (m >= 3 && m <= 5) {
			printSeason("�t");
		} else if (m >= 6 && m <= 8) {
			printSeason("��");
		} else if (m >= 9 && m <= 11) {
			printSeason("�H");
		} else if (m == 12 || m == 1 || m == 2) {
			printSeason("�~");
		}
 	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�G�߂�\�����܂��B");
		System.out.print("�����ł����F"); int m = stdIn.nextInt();
		season(m);
	}

}
