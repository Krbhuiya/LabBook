/*
 *Email and password check 
 */
package handsonday4;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MatchPattern {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email: ");
		String email = sc.nextLine();
		String checkemail = "^(.+)@{1}(.+)\\.(.+)$";
		String checkemail1 = "^[a-zA-Z0-9+_.-]+@(.+)\\.(.+)[^@!*%0-9]$";
		//"^[A-Za-z0-9._$+]{4,}[a-zA-Z0-9]@[a-z]{2,6}\\.(.+)$"
		Pattern pattern = Pattern.compile(checkemail1);
		Matcher matcher = pattern.matcher(email);
		System.out.println(matcher.matches());
		//bikramjit.3bhuiya@gmail.gov.in
	}
}