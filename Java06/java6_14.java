import java.util.Random;
import java.util.Scanner;

class java6_14 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] mo = {
			"January","February","March","April","May","June","July",
			"August","September","October","November","December"
		};
		
		System.out.println("英語の月名を入力してください。\n" +
			"なお、先頭は大文字で、2文字目以降は小文字とします。");
		
		int retry = 0;
		
		do {
			int t = rand.nextInt(12)+1;
			System.out.print(t +"月：");
			String m2 = stdIn.next();
		
			if (m2.equals (mo[ (t-1) ]) ) {
				System.out.print("正解です。もう一度？ 1･･･Yes／0…No：");
				retry = stdIn.nextInt();
			} else {
				System.out.println("違います。");
			}
		} while (retry == 1);
	}
}