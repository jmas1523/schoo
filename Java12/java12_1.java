import java.util.Scanner;

public class java12_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�Ԃ̃f�[�^����͂���B");
		System.out.print("���O�́F"); String name = stdIn.next();
		System.out.print("�ԕ��́F"); int width = stdIn.nextInt();
		System.out.print("�����́F"); int height = stdIn.nextInt();
		System.out.print("�����́F"); int length = stdIn.nextInt();
		System.out.print("�K�\�����̗ʂ́F"); double fuel = stdIn.nextDouble();
		
		CarTotal myCar = new CarTotal(name, width, height, length, fuel);
		
		myCar.putSpec();
		
		while (true) {
			System.out.println("���ݒn�i"+ myCar.getX() +", "+ myCar.getY() +
								")�E�c��R���@"+ myCar.getFuel());
			System.out.print("�ړ����܂���[0���No�^1���Yes]:");
			if (stdIn.nextInt() == 0) { break; }
			
			System.out.print("X�����̈ړ������F");
			double dx = stdIn.nextDouble();
			System.out.print("Y�����̈ړ������F");
			double dy = stdIn.nextDouble();
			
			double dist = Math.sqrt(dx * dx + dy * dy);
			
			if (!myCar.move(dx, dy)) {
				System.out.println("�R��������܂���I");
			} else {
				System.out.println("�����s������"+ myCar.totalDist(dist) +"�ł�");
			}
		}
	}
}
