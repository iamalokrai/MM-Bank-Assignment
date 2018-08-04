//To initialize account number to new accounts and also implement withdraw and deposit
public class SavingsAccount {

	private static int accountNumber = 1000;
	private int accountNumber1;
	private String accountHolder;
	private double accountBalance;

	// Constructor created having two parameters
	public SavingsAccount(String accountHolder, double accountBalance) {
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}

	// Constructor to initialize the account balance
	public SavingsAccount(String accountHolder) {
		this.accountHolder = accountHolder;
		accountBalance = 0.0;
	}

	// Getter and setter methods

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	double withdraw(double amount1) {
		double amount = amount1;
		accountBalance = accountBalance - amount;
		return accountBalance;
	}

	double deposit(double amount1) {
		double amount = amount1;
		accountBalance = accountBalance + amount;
		return accountBalance;
	}

	int getNextAccountNumber() {
		return accountNumber1 + 1;

	}

	public int getAccountNumber1() {
		return accountNumber1;
	}

	public void setAccountNumber1() {
		accountNumber++;
		accountNumber1 = accountNumber;
	}

	public void setAccountBalance(double accountBalance) {

		this.accountBalance = accountBalance;
	}
}
