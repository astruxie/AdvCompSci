/*****-[Samantha J. Noggle]-*****
 **********-[Period 2]-**********
 *********--[05/20/19]--*********
 **-[This is my own work SJN]-**
 * -[Summation program.]-*/

 // i couldnt make this a class because i couldnt test it in an online compiller

 //also the equation thing is just n x 2

import java.util.*;
public class summation
{
	public static void main(String args[])
   {
	   //variables
	   Scanner reader = new Scanner(System.in);
	   int indofSum = 0;
	   int limit = 0;
	   int type = 0;
	   int sum = 0;

	   System.out.println("Please enter the index of summation: ");
	   indofSum = reader.nextInt();

	   System.out.println("Please enter the upper limit: ");
	   limit = reader.nextInt();

	   System.out.println("Recursive(1) or Iterative(2)?");
	   type = reader.nextInt();

	   if (type == 1){
		   recursiveSummation(limit, indofSum, sum);
		   }
	   else if(type == 2){
		   iterativeSummation(limit, indofSum, sum);
		   }
   }
}//end main

 public static int recursiveSummation(int limit, int indofSum, int sum);{
	 //big ole base case
	 if (sum <= limit){
		 return sum;
		 }
	//the thingy
	 else {
		 sum = sum + (indofSum * 2);
		 iterativeSummation(limit, indofSum, sum);
		 }

	 }

 public static int iterativeSummation(int limit, int indofSum, int sum);{
	 while (sum <= limit){
		 sum = sum + (indofSum * 2);
		 }
		 return sum;
	 }