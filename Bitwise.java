/*****-[Samantha J. Noggle]-*****
 **********-[Period 2]-**********
 *********--[04/15/18]--*********
 **-[This is my own work SJN]-**
 * -[Bitwise Thing to practice the bitwise things.]-*/
 import java.util.*;
 public class Bitwise  {
 	public static void main (String[] args){
		//Variables
		Scanner reader = new Scanner(System.in);
		int input = 0;
		int i = 0;
		int[] bit1Array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] bit2Array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] orArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] andArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] xorArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		//Get the info from the user
		System.out.println("Please enter the numbers of the FIRST array: ");
		System.out.println("Type '9' when finished");

		while(input == 1 || input == 0){
			System.out.println("Enter 1 or 0:");
			input = reader.nextInt();
			if(input != 9){
				bit1Array[i] = input;
			}
			i++;
			}

		System.out.println("Please enter the numbers of the SECOND array: ");
		System.out.println("Type '9' when finished");
		//reset index and stuff
		i = 0;
		input = 0;

		while(input == 1 || input == 0){
			System.out.println("Enter 1 or 0:");
			input = reader.nextInt();
			if(input != 9){
				bit2Array[i] = input;
			}
			i++;
			}
		System.out.println("These are your arrays:");
		for(int x = 0; x < bit1Array.length; x++){
			System.out.print(bit1Array[x] + " ");
			}
		System.out.println(" ");
		for(int y = 0; y < bit2Array.length; y++){
				System.out.print(bit2Array[y] + " ");
			}

		//do the checks
		for (int x = 0; x < bit1Array.length; x++){
			//or
			if (bit1Array[x] == 1 || bit2Array[x] == 1 ){
				orArray[x] = 1;
				}

			//and same = 1
			if (bit1Array[x] == bit2Array[x]){
				andArray[x] = 1;
				}

			//xor both different  = 1
			if (bit1Array[x] != bit2Array[x]){
				xorArray[x] = 1;
				}
			}//end for


		//print it all out
		System.out.println("\nTHE RESULTS:\n");
		//or
		System.out.println("OR: ");
			for(int x = 0; x < orArray.length; x++){
				System.out.print(orArray[x] + " ");
			}
			System.out.println("\n");
		//and
		System.out.println("AND: ");
					for(int x = 0; x < andArray.length; x++){
						System.out.print(andArray[x] + " ");
			}
			System.out.println("\n");
		//xor
		System.out.println("XOR: ");
							for(int x = 0; x < xorArray.length; x++){
								System.out.print(xorArray[x] + " ");
			}
	}
 }