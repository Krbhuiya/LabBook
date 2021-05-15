/*
 * Write a java program that simulates a traffic light. 
 * The program lets the user select one of three lights: red, yellow, or green with radio buttons.
 * On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .
 * Initially there is no message shown.
 */
package jeefscorejava;
import java.util.Scanner;
public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter your choice: ");
			String choice = sc.nextLine();
			switch(choice)
			{
			case "Red" :
					System.out.println("STOP");
					break;
			case "Yellow" : 
					System.out.println("READY");
					break;
			case "Green" :
					System.out.println("GO");
					break;
			default :
					System.out.println("Wrong Choice");
			}
		
		sc.close();
		
	}

}
