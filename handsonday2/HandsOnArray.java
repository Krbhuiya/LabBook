package handsonday2;
import java.util.Scanner;
public class HandsOnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr_1[] = new int[10];
		int arr_2[] = new int[10];
		
		System.out.println("Enter value for 1st Array: ");
		for(int i=0; i<10; i++)
		{
			arr_1[i] = sc.nextInt();
		}
		for(int i=0; i<10; i++)
		{
			if(arr_1[i] == 0)
			{
				System.out.println(arr_1[i]);
				continue;
			}
		}
		
		System.out.println("Enter value for 2nd Array: ");
		for(int i=0; i<10; i++)
		{
			arr_2[i] = sc.nextInt();
		}
		
		for(int i=0; i<10; i++)
		{
			if(arr_2[i] == 0)
			{
				System.out.println(arr_2[i]);
				break;
			}
		}
		
		
	}

}
