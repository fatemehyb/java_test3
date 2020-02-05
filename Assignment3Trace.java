public class Assignment3Trace
{
	public static void main(String [] args)
	{
		Customer c1 = new Customer("Alison Brown", 123);
		BankAccount b1 = new BankAccount(c1, 100.00);
		
		Customer c2 = b1.getCustomer();
		c2.setName("Charles Green");
		System.out.println(c1);
		System.out.println(c2);
		
		Customer c3 = c1;
		c3.setName("Eva White");
		System.out.println(b1.getCustomer());
		System.out.println(c3);
	}	

}