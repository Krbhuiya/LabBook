package handsonday5.polymorphismone;

public class Transaction {
	private int accno;

	public long getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}
	
	public void Execute()
	{
		System.out.println("Executing Transac.");
	}
}
