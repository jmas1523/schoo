import java.util.Scanner;

public class java8_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���Ȃ��̃f�[�^����͂��Ă��������B");
		System.out.print("���O�F"); String name = stdIn.next();
		System.out.print("�N��F"); int age = stdIn.nextInt();
		System.out.print("�g����(m�ŋL��)�F"); double height = stdIn.nextDouble();
		System.out.print("�̏d�́ikg�ŋL���j�F"); double weight = stdIn.nextDouble();
		
		Person person = new Person(name, age, height, weight);
		
		System.out.println("���Ȃ��̃f�[�^��\�����܂��B");
		person.printData();
		

	}

}
