

public class java12_2 {

	public static void main(String[] args) {

		
		Account a = new Account("�����K��", "123456", 1000);
		
		TimeAccount b = new TimeAccount("���c�^��", "654321", 200, 500);

		
		switch(TimeAccount.compBalance(a, b)) {
		case 0: System.out.println("�����N�ƒ��c�N�̗a���c���͓����B"); break;
		case 1: System.out.println("�����N�̂ق����a���c���������B"); break;
		case -1: System.out.println("���c�N�̂ق����a���c���������B"); break;
		}
	}
}
