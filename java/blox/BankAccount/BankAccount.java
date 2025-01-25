package blox.BankAccount;

public class BankAccount {
	private String accountNumber;
	private double balance;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public boolean debit(double amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public void credit(double amount) {
		balance += amount;
	}
}
