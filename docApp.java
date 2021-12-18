/*****-[Samantha J. Noggle]-*****
 **********-[Period 2]-**********
 *********--[03/12/19]--*********
 **-[This is my own work SJN]-**
 * -[App for doc queues.]-*/

import java.util.*;

public class docApp{
	public static void main(String[]args){
		//variables
		Scanner reader = new Scanner(System.in);
		String choice = "default";
		String name;
		int count = 0;
		 Queue<String> patients = new LinkedList<>();


		System.out.println("Welcome to the doctors office!");

		while (!choice.equals("Done")){
		System.out.println("Are you a Doctor or Patient?");
		System.out.println("Type 'Done' to end the day");
		choice = reader.nextLine();

		//check if doctor or patient and do methods
		if(choice.equals("Doctor")){
			//Doctor stuff
			System.out.println(patients.peek() + " is next in line. Do you want to remove them? (Y/N)");
			choice = reader.nextLine();
			if (choice.equals("Y") ){
				patients.remove();
				System.out.print("They have been removed!");
				}
			else  {
				System.out.println("Aight cool, thats all then");
				}
			}
		else if(choice.equals("Patient")){
			//patient method to add a  patient
			System.out.println("Please enter your name...");
			name = reader.nextLine();
			patients.add(name);
			count++;
			System.out.println(name + " has been added to the queue!");
			}
		}
		int timeWaited = count * 15;
		System.out.println("The day is over! The total wait time for the day was: " + timeWaited + " minutes!");
		System.out.println("There were " + count + " patients today.");
		}
	}

