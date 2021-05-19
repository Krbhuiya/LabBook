package handsonday5.polymorphismtwo;

public class Academic extends Payroll{

	private String name;
	private double salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void giveLecture()
	{
		System.out.println("Giving Lecture.");
	}
	
	@Override
	public void adjustSalary(int salary)
	{
		System.out.println(getName()+"'s adjusted Salary: "+salary);
	}
}
