package blox.BankAccount;


/*Q.) Banking works by transferring money from account A to account B. Most of the time
account A is in one bank while account B is another bank. Implement the code to transfer
money. Remember, payee's code runs on a different computer than that of the receiver's
code.
1. What are the issues in such a system?
2. What can we do to mitigate some of the issues ?
3. Write the fixing yourself to demonstrate the mitigations. */

public class Calculate {
	 public static void main(String[] args) {
	        BankAccount accountA = new BankAccount("A123", 1000);
	        BankAccount accountB = new BankAccount("B456", 500);

	        System.out.println("Initial Balances:");
	        System.out.println("Account A: " + accountA.getBalance());
	        System.out.println("Account B: " + accountB.getBalance());

	        MoneyTransfer.transfer(accountA, accountB, 300);

	        System.out.println("Final Balances:");
	        System.out.println("Account A: " + accountA.getBalance());
	        System.out.println("Account B: " + accountB.getBalance());
	    }
}
