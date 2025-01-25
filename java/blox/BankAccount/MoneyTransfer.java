package blox.BankAccount;

public class MoneyTransfer {
	 public static boolean transfer(BankAccount sender, BankAccount receiver, double amount) {
	        
	        if (!sender.debit(amount)) {
	            System.out.println("Insufficient funds in sender's account.");
	            return false;
	        }

	       
	        if (!receiverIsAvailable()) {
	            System.out.println("Receiver is not available. Rolling back transaction.");
	            sender.credit(amount); 
	            return false;
	        }

	        
	        receiver.credit(amount);
	        System.out.println("Transaction successful!");
	        return true;
	    }

	    private static boolean receiverIsAvailable() {	        
	        return true; 
	    }
}
