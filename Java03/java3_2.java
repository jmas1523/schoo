import java.util.Scanner;

class java3_2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数Ａ：");
		int a = stdIn.nextInt();
		
		System.out.print("整数Ｂ：");
		int b = stdIn.nextInt();
		
		if (a%b == 0)
		System.out.println("ＢはＡの約数です。");
		else
		System.out.println("ＢはＡの約数ではありません。");
	}
}
