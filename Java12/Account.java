
public class Account {
	private String name;
	private String no;
	private long balance;
	
	Account(String name, String no, long balance) {
		this.name = name;   this.no = no;   this.balance = balance;
	}
	
	String getName() {
		return name;
	}
	
	String getNo() {
		return no;
	}
	
	long getBalance() {
		return balance;
	}
	
	void deposit(long k) {
		balance += k;
	}
	
	void withdraw(long k) {
		balance -= k;
	}
}