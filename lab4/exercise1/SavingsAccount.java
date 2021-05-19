package lab4.exercise1;

public class SavingsAccount extends Account {

	final double minimumbalance = 500;
	private double bal;
	
	
	@Override
	public void withdraw(double balance)
	{
		if(getBalance() >= minimumbalance)
		{
			this.bal = getBalance();
			this.bal = this.bal - balance;
			if(bal > minimumbalance)
			{
				super.setBalance(this.bal);
				System.out.println(balance+" withdrawn");
				System.out.println(getPerson().getName()+"'s current balance: "+super.getBalance());
			}
			else
			{
				System.out.println("Not enough balance to withdraw.");
			}
		}
		else
		{
			System.out.println("Not enough balance to withdraw.");
		}
	}
}
