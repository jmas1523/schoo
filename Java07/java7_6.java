import java.util.Scanner;

public class java7_6 {

	public static void printSeason(String m) {
		System.out.println(m +"です。");
	}
	public static void season(int m) {
		if (m >= 3 && m <= 5) {
			printSeason("春");
		} else if (m >= 6 && m <= 8) {
			printSeason("夏");
		} else if (m >= 9 && m <= 11) {
			printSeason("秋");
		} else if (m == 12 || m == 1 || m == 2) {
			printSeason("冬");
		}
 	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("季節を表示します。");
		System.out.print("何月ですか："); int m = stdIn.nextInt();
		season(m);
	}

}
