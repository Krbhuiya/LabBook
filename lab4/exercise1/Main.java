package lab4.exercise1;
import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	static int n=1;
	static int i=0;
	static Account[] accountArray = new Account[n];
	static Account[] currentaccountArray = new Account[n];
	
	public static void createAccount(Account acc1,Account acc2)
	{
		for(; i<accountArray.length; i++)
		{
			accountArray[i] = acc1;
			currentaccountArray[i] = acc2;
			System.out.println("Mr."+accountArray[i].getPerson().getName() +" your account is created.");
			//System.out.println(accountArray.length);
		}
		if(n == i)
		{
			n=n+1;
			accountArray = Arrays.copyOf(accountArray,n);
			currentaccountArray = Arrays.copyOf(currentaccountArray, n);
		}
	}
	
	public static void checkDeposit(String name)
	{
		Scanner sc = new Scanner(System.in);
		int check = 0;
		int pos = 0;
		for(int j=0; j<accountArray.length; j++)
		{
			String ch = accountArray[j].getPerson().getName(); 
			if(name.equals(ch))
			{
				check = 1;
				pos = j;
				break;
			}
			else
				check = 0;
		}
		
		if(check == 1)
		{
			System.out.println("Enter deposit amount: ");
			int bal = sc.nextInt();
			accountArray[pos].deposit(bal);
		}
		else
		{
			System.out.println("Wrong name");
		}
	}
	
	public static void checkWithdraw(String name)
	{	
		Scanner sc = new Scanner(System.in);
		int check = 0;
		int pos = 0;
		for(int j=0; j<accountArray.length; j++)
		{
			String ch = accountArray[j].getPerson().getName(); 
			if(name.equals(ch))
			{
				check = 1;
				pos = j;
				break;
			}
			else
			check = 0;
		}
		if(check == 1)
		{
			System.out.println("Enter withdrawal amount: ");
			int bal = sc.nextInt();
			accountArray[pos].withdraw(bal);
		}
		else
		{
			System.out.println("Wrong name");
		}
	}
	
	public static void checkCurrent(String name)
	{
		Scanner sc = new Scanner(System.in);
		int check = 0;
		int pos = 0;
		for(int j=0; j<currentaccountArray.length; j++)
		{
			String ch = currentaccountArray[j].getPerson().getName(); 
			if(name.equals(ch))
			{
				check = 1;
				pos = j;
				break;
			}
			else
			check = 0;
		}
			if(check == 1)
			{
				System.out.println("Enter withdrawal amount: ");
				int bal = sc.nextInt();
				currentaccountArray[pos].withdraw(bal);
			}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		char ch;
		do
		{
		System.out.println("Enter 1 to create account: ");
		System.out.println("Enter 2 to deposite amount into Savings account: ");
		System.out.println("Enter 3 to withdraw amount from Savings account: ");
		System.out.println("Enter 4 to withdraw amount from Current account: ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Account holder's name: ");
			String name = sc.next();
			System.out.println("Age: ");
			int age = sc.nextInt();
			long accno = rd.nextLong();
			System.out.println("Account openning balance: ");
			double balance = sc.nextDouble();
			
			Person person = new Person();
			person.setName(name);
			person.setAge(age);
			
			SavingsAccount sa = new SavingsAccount();
			CurrentAccount ca = new CurrentAccount();
			
			sa.setPerson(person);
			ca.setPerson(person);
			ca.setAccNum(accno);
			sa.setAccNum(accno);
			sa.setBalance(balance);
			createAccount(sa,ca);
			break;
		case 2:
			System.out.println("Enter account holder's name: ");
			String name_c = sc.next();
			checkDeposit(name_c);
			break;
		case 3:
			System.out.println("Enter account holder's name: ");
			String name_w = sc.next();
			checkWithdraw(name_w);
			break;
		case 4:
			System.out.println("Enter account holder's name: ");
			String name_cu = sc.next();
			checkCurrent(name_cu);
			break;
		default: 
			System.out.println("Wrong Choice.");
		}
		System.out.println("Want to continue(y/n): ");
		ch = sc.next().trim().charAt(0);
		}while(ch == 'y');
		
		sc.close();
	}

}
