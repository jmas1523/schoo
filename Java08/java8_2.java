import java.util.Scanner;

public class java8_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�Ԃ̃f�[�^����͂���B");
		System.out.print("���O�́F"); String name = stdIn.next();
		System.out.print("�i���o�[�́F"); int number = stdIn.nextInt();
		System.out.print("�ԕ��́F"); int width = stdIn.nextInt();
		System.out.print("�����́F"); int height = stdIn.nextInt();
		System.out.print("�����́F"); int length = stdIn.nextInt();
		System.out.print("�K�\�����̗ʂ́F"); double fuel = stdIn.nextDouble();
		System.out.print("�R���(km/L)�F"); double fuelEco = stdIn.nextDouble();
		
		Car myCar = new Car(name, number, width, height, length, fuel, fuelEco);
		
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
			
			if (!myCar.move(dx, dy)) {
				System.out.println("�R��������܂���I");
				}
			}

	}

}
