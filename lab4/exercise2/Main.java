package lab4.exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		char ch;
		do
		{
			System.out.println("1 to add Book details.");
			System.out.println("2 to add Journal paper details.");
			System.out.println("3 to add Video details.");
			System.out.println("4 to add CD details.");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				Book b = new Book();
				b.addItem();
				System.out.println(b);
				break;
			case 2:
				JounalPaper jp = new JounalPaper();
				jp.addItem();
				System.out.println(jp);
				break;
			case 3:
				Video v = new Video();
				v.addItem();
				System.out.println(v);
				break;
			case 4:
				CD cd = new CD();
				cd.addItem();
				System.out.println(cd);
				break;
			default:
				System.out.println("Wrong details.");
			}
			System.out.println("Enter y to continue: ");
			ch = sc.next().trim().charAt(0);
		}while(ch == 'y');
		sc.close();
	}

}
