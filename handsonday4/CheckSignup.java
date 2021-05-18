/*
 * 
Write a program to validate username and password and email and mobileno and city and pincode?

a) username should be greater than 8 characters should contain atleast one spl character
either _,-,.
b) validate email 
c)validate the password ,which should contain 8 characters with atleast one spl character
d) city should contain only alphabets
e)  pincode should contain only 6 digits
f) mobile number should start with either 7,8,9 and length of 10 

 */
package handsonday4;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CheckSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("User Name: ");
		String uname = sc.next();
		//^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&(){}[]:;<>,.?/~_+-=|\]).{8,32}$
		
		String uname_check = "^(?=.*[a-zA-Z0-9])(?=.*[*._-]).{8,}$";
		Pattern pattern = Pattern.compile(uname_check);
		Matcher matcher = pattern.matcher(uname);
		System.out.println("For User Name: "+matcher.matches());
		
		System.out.println("Password: ");
		String pass = sc.next();
		String checkPass = "^(?=.*[a-zA-Z0-9])(?=.*[*._-!@#$%^&])";
		Pattern pattern1 = Pattern.compile(checkPass);
		Matcher matcher1 = pattern1.matcher(pass);
		System.out.println("Password: "+matcher1.matches());
		
		System.out.println("Email: ");
		String email = sc.next();
		String checkEmail = "^[a-zA-Z0-9+_.-]+@(.+)\\.(.+)[^@!*%0-9]$";
		Pattern pattern2 = Pattern.compile(checkEmail);
		Matcher matcher2 = pattern2.matcher(email);
		System.out.println("Email: "+matcher2.matches());
		
		System.out.println("City: ");
		String city = sc.next();
		String checkCity = "^(?= .*[a-zA-Z])";
		Pattern pattern3 = Pattern.compile(checkCity);
		Matcher matcher3 = pattern3.matcher(city);
		System.out.println(matcher3.matches());
		
		System.out.println("Pincode: ");
		String pincode = sc.next();
		String checkPin = "^(?=.*[0-9].{6})";
		Pattern pattern4 = Pattern.compile(checkPin);
		Matcher matcher4 = pattern4.matcher(pincode);
		System.out.println(matcher4.matches());
		
	}

}
