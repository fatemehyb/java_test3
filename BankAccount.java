
/**
 * <h1> BankAccount Program </h1>
 * 
 * BankAccount program shows the basic deposit and withdraw functions 
 * from a banking application.
 * 
 * @author Alex, Sifat, Nathan, Richie, Quin
 * 
 */

public class BankAccount {

	private double balance = 0.0; 
	private double overdraftAmount = 100.0;
	
	/**
   	* This method is used for depositing money into the account. If the amount is greater than 0 it can be deposited  
	* @param amount is the amount that you are depositing into the account
	*/

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

    /**
	 * The withdraw function is used to take money from the balance of the account
	 * Checks if the the amount you are trying to withdraw is currently available from your balance and that you won't exceed the overdraft limit
	 * @param amount is the amount you are trying to withdraw
	 */

	public void withdraw(double amount) {
		if((amount<balance) || (amount>balance) && (overdraftAmount>0)){
			balance = balance-amount;
		} else {
			this.balance=balance;
		}
	}

    /**
	 * Setter statement for the overdraft amount
	 */

	public void setOverdraftAmount(double amount) {
		this.overdraftAmount=amount;
	}
	
    /**
	 * This is the getter statement for the balance
	 */

	public double getBalance() {
		return balance;
	}


}
