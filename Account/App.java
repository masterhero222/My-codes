package Account;

public class App {

	public static void main(String[] args) {
		
		Account account1 = new Account("Goy", "Sir", "2", "GoySir_21");
		Account account2 = new Account("Joe", "JD", "3", "JDJoe_2");
		account1.setBalance(400);
		account2.setBalance(100);
		
		
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		System.out.println("\n");
		account1.transferTo(account2, 3);
		System.out.println("\n");
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		
	}

}
