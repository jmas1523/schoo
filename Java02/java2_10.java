import java.util.Scanner;

class java2_10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("姓：");
		String s = stdIn.next();
		
		System.out.print("名：");
		String m = stdIn.next();
		
		System.out.println("こんにちは"+(s+m)+"さん。");
	}
}
