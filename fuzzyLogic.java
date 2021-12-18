/*****-[Samantha J. Noggle]-*****
 **********-[Period 2]-**********
 *********--[04/18/18]--*********
 **-[This is my own work SJN]-**
 * -[Prom Date thing fuzzy logic .]-*/
 import java.util.*;
 public class fuzzyLogic  {
 	public static void main (String[] args){

		//variables
		double userVal = 1;
		double dateVal = 1;
		boolean goingToProm = true; //going together or not
		Scanner reader = new Scanner(System.in);

		//ask values
		System.out.println("Hello, how happy are you? (0 - 1)");
		userVal = reader.nextDouble();

		System.out.println("How happy is your date? (0 - 1)");
		dateVal = reader.nextDouble();

		//calculate things
		if (userVal > dateVal){
			System.out.println("Your date is not as happy as you!");
			}
		if (userVal > 0.5 ){
			System.out.println("You're pretty unhappy! You shouldnt go too prom with this date!");
			goingToProm = false;
		}
		if (dateVal > 0.5 && userVal > 0.5){
			System.out.println("You and your date are happy!");
			goingToProm = true;
		}
		int totVal = userVal + dateVal;
		System.out.println("You and tour date's total happiness is: " + totVal);
 	}
 }