
public class PaymentGateway {
	// Method to check if transfer of money is possible
	public static boolean transfer(SavingsAccount sender, SavingsAccount receiver, double amount) {

		if (sender.getAccountBalance() >= amount) {
			return true;
		} else
			return false;
	}
}
