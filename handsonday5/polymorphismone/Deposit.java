package handsonday5.polymorphismone;

public class Deposit extends Transaction{

	private double amount;
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public void Execute()
	{
		System.out.println("Executing Transaction.");
		System.out.println(this.amount+" Deposited");
	}
	
}
