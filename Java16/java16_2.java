import java.util.Scanner;

class RangeError extends RuntimeException {
	RangeError(int n) { super("�͈͊O�̒l�F"+ n); }
}

class ParameterRangeError extends RangeError {
	ParameterRangeError(int n) { super(n); }
}

class ResultRangeError extends RangeError {
	ResultRangeError(int n) { super(n); }
}

public class java16_2 {
	
	static boolean isValid(int n) {
		return n >= 0 && n <= 9;
	}
	
	static int add(int a, int b) throws ParameterRangeError, ResultRangeError {
		if (!isValid(a)) throw new ParameterRangeError(a);
		if (!isValid(b)) throw new ParameterRangeError(b);
		int result = a + b;
		if (!isValid(result)) throw new ResultRangeError(result);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a�F"); int a = stdIn.nextInt();
		System.out.print("����b�F"); int b = stdIn.nextInt();
		
		try {
			System.out.println("�����̘a��"+ add(a, b) +"�ł��B");
		} catch (RangeError e) {
			if (e instanceof ParameterRangeError) {
				System.out.println("�����鐔���͈͊O�ł��B"+ e.getMessage());
			} else if (e instanceof ResultRangeError) {
				System.out.println("�v�Z���ʂ��͈͊O�ł��B"+ e.toString());
			}
		}
	}
}
