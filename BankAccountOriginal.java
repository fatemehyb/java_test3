public class BankAccount {
	private double balance;
	private double overdraftAmount = 100.0;	
	private Customer accountOwner;
	
	public BankAccount()
	{
		accountOwner = new Customer("", 0);
	}	
	
	public BankAccount(Customer newOwner, double newBalance)
	{
		accountOwner = new Customer(newOwner);
		balance = newBalance;
	}
	
	public Customer getCustomer()
	{
		return accountOwner;		
	}
	
	public double getBalance() {
		return balance;
	}

	public void setOverdraftAmount(double newOverdraftAmount)
	{
		overdraftAmount = newOverdraftAmount;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance){
			balance -= amount;
		}
	}
	
}