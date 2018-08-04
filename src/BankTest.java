import java.util.Scanner;

//to test the Savings Account class and also get the next account number
public class BankTest {

	public static void main(String[] args) {

		SavingsAccount account1 = new SavingsAccount("Alok", 5000.0);
		SavingsAccount account2 = new SavingsAccount("Shivam");

		account1.setAccountNumber1();
		account2.setAccountNumber1();

		System.out.println("Name: " + account1.getAccountHolder() + "" + "\nAccount Number :"
				+ account1.getAccountNumber1() + "\nBalance :" + account1.getAccountBalance());

		System.out.println("Name: " + account2.getAccountHolder() + "" + "\nAccount Number :"
				+ account2.getAccountNumber1() + "\nBalance :" + account2.getAccountBalance());

		System.out.println("Next account number: " + account2.getNextAccountNumber());

		System.out.println("Enter 1 if transfer is to be from Alok to Shivam or 2 for vice versa");

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		double amount = scanner.nextDouble();

		if (a == 1) {

			if (PaymentGateway.transfer(account1, account2, amount) == true) {
				System.out.println("Transaction Successful");
				account1.setAccountBalance(account1.getAccountBalance() - amount);
				account2.setAccountBalance(account2.getAccountBalance() + amount);

				System.out.println("New Account balances: \nAlok: " + account1.getAccountBalance() + "\nShivam: "
						+ account2.getAccountBalance());
			} else
				System.out.println("Transaction Unsuccessful");
		} else {

			if (PaymentGateway.transfer(account2, account1, amount) == true) {
				System.out.println("Transaction Successful");

				account1.setAccountBalance(account1.getAccountBalance() + amount);
				account2.setAccountBalance(account2.getAccountBalance() - amount);

				System.out.println("New Account balances: \nAlok: " + account1.getAccountBalance() + "\nShivam: "
						+ account2.getAccountBalance());

			} else
				System.out.println("Transaction Unsuccessful");

		}
		scanner.close();
	}

}
