/*****-[Samantha J. Noggle]-*****
 **********-[Period 2]-**********
 *********--[05/20/19]--*********
 **-[This is my own work SJN]-**
 * -[Calculates the probablility that two classmates have the same birthday.]-*/

import java.util.*;
public class birthdayProbability
{
	public static void main(String args[])
   {
	 //variables
	 Scanner reader = new Scanner(System.in);
	 int classSize = 0; //from 1 to 500
	 int birthArray[] = 0;
	 ArrayList<Integer> sharedBirth = new ArrayList<Integer>;

	 System.out.println("What is your class size?");
	 classSize = reader.nextInt();

	for (int i = 0; i < classSize; i++){
	 int day = (int)(Math.random() * 365) + 1;
	 birthArray[i] = day;
	 probSharedBday(birthArray, sharedBirth, classSize);

System.out.println("Out of " + classSize + " students, there were  " + sharedBirth.size() + " shared birthdays!");

	convertString(birthArray, sharedBirth, classSize);

	}
}//end main
	public static void probSharedBday(int [] birthArray, sharedBirth, int classSize){
		boolean shared = false
		int count = 0;
		while (shared = false){
			count++;
			for (int i = 0; i < classSize; i++){
				for (int x = 0; x < classSize; x++){
					if (x != i){
						if (birthArray[i] == birthArray[x]){
							sharedBirth.add(birthArray[i]);
							shared = true;
							}
						}
					}
				}
				}//end all that stuff
	System.out.println("Number of simulations it took for there to be shared birthdays: " + count);
		}

	public static void convertString(int [] birthArray, sharedBirth, int classSize){
		int temp = 0;
		for (int i = 0; i < classize; i++){
			if (birthArray[i] < 31){
				temp = birthstring[i];
				System.out.println("Jan " + temp); //31
				}
			else if (birthArray[i] > 31 && birthArray[i] < 59){
				temp = birthstring[i] - 31;
				System.out.println("Feb " + temp); //28
				}
			else if (birthArray[i] > 59 && birthArray[i] < 90 ){
				temp = birthstring[i] - 59;
				System.out.println("Mar " + temp); //31
				}
			else if (birthArray[i] > 90 && birthArray[i] < 120 ){
				temp = birthstring[i] - 90;
				System.out.println("Apr" + temp);//30
				}
			else if (birthArray[i] > 120 && birthArray[i] < 151 ){
				temp = birthstring[i] - 120;
				System.out.println("May" + temp);//31
				}
			else if (birthArray[i] > 151 && birthArray[i] < 171 ){
				temp = birthstring[i] - 151;
				System.out.println("Jun" + temp); //30
				}
			else if (birthArray[i] > 171 && birthArray[i] < 201 ){
				temp = birthstring[i] - 171;
				System.out.println("Jul" + temp); //31
				}
			else if (birthArray[i] > 201 && birthArray[i] < 232 ){
				temp = birthstring[i] - 201;
				System.out.println("Aug" + temp);//31
				}
			else if (birthArray[i] > 232 && birthArray[i] < 262 ){
				temp = birthstring[i] - 232;
				System.out.println("Sep" + temp); //30
				}
			else if (birthArray[i] > 262 && birthArray[i] < 293 ){
				temp = birthstring[i] - 262;
				System.out.println("Oct" + temp); //31
				}
			else if (birthArray[i] > 293 && birthArray[i] < 323 ){
				temp = birthstring[i] - 293;
				System.out.println("Nov" + temp); //30
				}
			else if (birthArray[i] > 323 && birthArray[i] < 351 ){   //yeah my math is really wrong here... i messed this up somehow
				temp = birthstring[i] - 323;
				System.out.println("Dec" + temp); //31
				}
			}
		}