package lab4.exercise1;

public class Account {

	private long accNum;
	private double balance;
	private Person person;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	//setter 
	public void setAccNum(long accNum)
	{
		this.accNum = accNum;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public void setPerson(Person person)
	{
		this.person = person;
	}
	
	//getter
	public long getAccNum()
	{
		return this.accNum;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public Person getPerson()
	{
		return this.person;
	}
	
	//methods
	
	
	public void deposit(double balance)
	{
		this.balance = this.balance + balance;
		System.out.println(person.getName()+"'s current balance: "+this.balance);
	}
	public void withdraw(double balance)
	{
		this.balance = this.balance - balance;
	}
	
}
