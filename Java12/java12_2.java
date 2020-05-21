

public class java12_2 {

	public static void main(String[] args) {

		
		Account a = new Account("足立幸一", "123456", 1000);
		
		TimeAccount b = new TimeAccount("仲田真二", "654321", 200, 500);

		
		switch(TimeAccount.compBalance(a, b)) {
		case 0: System.out.println("足立君と仲田君の預金残高は同じ。"); break;
		case 1: System.out.println("足立君のほうが預金残高が多い。"); break;
		case -1: System.out.println("沖田君のほうが預金残高が多い。"); break;
		}
	}
}
