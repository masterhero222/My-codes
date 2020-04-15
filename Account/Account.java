package Account;

public class Account {
	private String accountName;
	private String firstName;
	private String lastName;
	private String id;
	private int balance;

	public Account(String fName, String sName, String id, String accountName) {
		this.accountName = accountName;
		this.firstName = fName;
		this.id = id;
		this.lastName = sName;

	}

	public String getAccountName() {
		return accountName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getId() {
		return id;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int credit) {
		return credit + balance;
	}

	public int debit(int debit) {
		return balance - debit;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int transferTo(Account Account, int amout)  {
		
		if(amout > Account.getBalance()) {
			System.out.println("Error");
			return 0;
			
		}else {
			Account.setBalance(Account.getBalance() + amout);
			return this.balance = balance - amout;
		}
		
		
	}

	

	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", firstName=" + firstName + ", lastName=" + lastName + ", id="
				+ id + ", balance=" + balance + "]";
	}

}
