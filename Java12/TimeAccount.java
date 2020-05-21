
public class TimeAccount extends Account {
	private long timeBalance;
	
	TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}
	
	long getTimeBalance() {
		return timeBalance;
	}
		
	static int compBalance(Account a, Account b) {
		long sumBalanceA = 0;
		long sumBalanceB = 0;
		if (a instanceof TimeAccount) {
			sumBalanceA = a.getBalance() + ((TimeAccount)a).getTimeBalance();
		} else {
			sumBalanceA += a.getBalance();
		}
		
		if (b instanceof TimeAccount) {
			sumBalanceB = b.getBalance() + ((TimeAccount)b).getTimeBalance();
		} else {
			sumBalanceB += b.getBalance();
		}
		
		if (sumBalanceA > sumBalanceB) {
			return 1;
		} else if (sumBalanceA < sumBalanceB) {
			return -1;
		}
		return 0;
	}
}
