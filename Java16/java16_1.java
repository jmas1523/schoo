import java.util.Scanner;

public class java16_1 {

	static void check(int sw) throws Exception {
		switch (sw) {
		case 1: throw new Exception("������O����!!");
		case 2: throw new RuntimeException("�񌟍���O����!!");
		}
	}
	
	static void test(int sw) throws Exception {
		check(sw);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("sw�F");
		int sw = stdIn.nextInt();
		
		try {
			test(sw);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

