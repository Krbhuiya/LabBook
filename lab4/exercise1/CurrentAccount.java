package lab4.exercise1;

public class CurrentAccount extends Account {
	double overdraft = 10000;
	private static double amount = 0;
	private static int flag = 0;
	@Override
	public void withdraw(double balance)
	{
		amount += balance;
		if(amount < overdraft)
		{
			System.out.println(balance+" withdrawn");
			flag=1;
		}
		else
		{
			System.out.println("Overdraft limit reached.");
			flag=0;
		}
	}
	public boolean sendFeedback() {
		
		if(flag == 1) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
