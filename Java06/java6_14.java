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
		
		System.out.println("�p��̌�������͂��Ă��������B\n" +
			"�Ȃ��A�擪�͑啶���ŁA2�����ڈȍ~�͏������Ƃ��܂��B");
		
		int retry = 0;
		
		do {
			int t = rand.nextInt(12)+1;
			System.out.print(t +"���F");
			String m2 = stdIn.next();
		
			if (m2.equals (mo[ (t-1) ]) ) {
				System.out.print("�����ł��B������x�H 1���Yes�^0�cNo�F");
				retry = stdIn.nextInt();
			} else {
				System.out.println("�Ⴂ�܂��B");
			}
		} while (retry == 1);
	}
}