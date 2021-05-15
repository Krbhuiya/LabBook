package lab3;
import java.util.*;

public class DateCalculation {

	public static void diffDate(String localdate,String givendate)
	{
		String[] words_local = localdate.split("-");
		String []words_given = givendate.split("-");
		int day = Math.abs((Integer.parseInt(words_local[2]) - Integer.parseInt(words_given[2]))
					+((Integer.parseInt(words_local[1]) - Integer.parseInt(words_given[1]))*30)
					+((Integer.parseInt(words_local[0]) - Integer.parseInt(words_given[0]))*365));
		
		double month = Math.abs(((double)(Integer.parseInt(words_local[2]) - Integer.parseInt(words_given[2]))/30)
					+((Integer.parseInt(words_local[1]) - Integer.parseInt(words_given[1])))
					+((Integer.parseInt(words_local[0]) - Integer.parseInt(words_given[0]))*12));
		
		double year = Math.abs(((double)(Integer.parseInt(words_local[2]) - Integer.parseInt(words_given[2]))/365)
					+((double)(Integer.parseInt(words_local[1]) - Integer.parseInt(words_given[1]))/12)
					+((Integer.parseInt(words_local[0]) - Integer.parseInt(words_given[0]))));
		
		System.out.println("Days: "+day);
		System.out.println("Months: "+month);
		System.out.println("Years: "+year);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String localdate = String.valueOf(java.time.LocalDate.now());
		
		System.out.println(localdate);  
	
		System.out.println("Enter a date in yyyy-mm-dd format: ");
		String givendate = sc.nextLine();
		
		diffDate(localdate,givendate);
		sc.close();
		
	}

}
