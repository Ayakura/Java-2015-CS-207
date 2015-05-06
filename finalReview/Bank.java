package finalReview;

public class Bank {
	private String customer;
	private double balance;
	private String dateOpened;
	
	public Bank()
	{
		customer = "John Doe";
		balance = 100.0;
		dateOpened = "12/13/2013";
	}
	
	public double deposit(double amount)
	{
		return balance + amount;
	}

	public static void main(String[] args) {
		double s = deposit(200.0);
		System.out.println(s);
	}

}
