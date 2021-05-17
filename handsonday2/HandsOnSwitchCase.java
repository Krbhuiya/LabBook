package handsonday2;
import java.util.Scanner;
public class HandsOnSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char arr[] = new char[10];
		char c;
		//char c = sc.next().charAt(0);
		do
		{
			System.out.println("Enter Choice : ");
			char choice = sc.next().charAt(0);
			switch(choice)
			{
			case 'T':
				for(int i=0; i<arr.length; i++)
				{
					arr[i] = sc.next().charAt(0);
				}
				break;
			case 'V':
				for(int i=0; i<arr.length; i++)
				{
					if(arr[i]=='a' || arr[i]=='e' ||arr[i]=='i' ||arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' ||arr[i]=='I' ||arr[i]=='O' || arr[i]=='U')
					{
						System.out.println(arr[i]);
					}
				}
				break;
			case 'C':
				for(int i=0; i<arr.length; i++)
				{
					if(!(arr[i]=='a' || arr[i]=='e' ||arr[i]=='i' ||arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' ||arr[i]=='I' ||arr[i]=='O' || arr[i]=='U'))
					{
						System.out.println(arr[i]);
					}
				}
				break;
			default:
				System.out.println("Wrong Input");
			}
		System.out.println("Enter y/n : ");
		c = sc.next().charAt(0);
		}while(c == 'y');
		

	}

}
