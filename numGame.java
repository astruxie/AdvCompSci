/*****-[Samantha J. Noggle]-*****
 **********-[Period 2]-**********
 *********--[03/019/19]--*********
 **-[This is my own work SJN]-**
 * -[Game that you gotta make 3 15s?.]-*/

 //this has so many nested things im sorry in advance

import java.util.*;

public class numGame{
	public static void main(String[]args){
		//variables
		Scanner reader = new Scanner(System.in);
		int[] playerOne = new int[4];
		int[] computer = new int[4];
		int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] takenArray = {0, 0, 0, 0, 0, 0, 0, 0, 0};
		int num = 0;
		int temp = 0;
		int count = 0;
		boolean flag = true;
		boolean compflag = true;
		int playersum = 0;
		int compnum = 0;

		System.out.println("Welcome to Make 15!");
			//game loop for 3 turns each
			for (int i = 0; i < 3; i++){
				//reset the flagerinos
				flag = true;
				compflag = true;
				//player tings
				while (flag == true){
					System.out.println("Player 1... Choose your number!");

					//print numbers left
					for (int x = 0; x < 9; x++){
						if (takenArray[x] != 1)
						System.out.print(numArray[x] + " ");
						}
					System.out.println("\n");

					num = reader.nextInt();
					temp = num - 1;
					if (takenArray[temp] != 1){
						flag = false;
						System.out.println("You have chosen " + num + "!");
						playerOne[i] = num;
						takenArray[temp] = 1;
					}//end if
				else{
					System.out.println("That number has already been chosen... please pick again");
					}
				}
				//computer tings
				System.out.println("Computer's turn...");
				while (compflag == true){
				num = (int)(Math.random() * 9) + 1;
				temp = num - 1;

				if (takenArray[temp] != 1){
					System.out.println("The computer has chosen " + num + "!\n");
					takenArray[temp] = 1;
					computer[i] = num;
					compflag = false;
					}

				}
			}//end for
			//calculate who won!!
			for (int y = 0; y < 3; y++){
				playersum = playerOne[y] + playersum;
				compnum = computer[y] + compnum;
				}
			System.out.println("Player 1's picks add up to: " + playersum);
			System.out.println("The computer's picks add up to: " + compnum);

			if (playersum == 15){
				System.out.println("You won!");
				}
			else if (compnum == 15){
				System.out.println("The computer won!");
				}
			else if (playersum != 15 && compnum != 15){
				System.out.println("Ok neither of you won. R.I.P.");
				}

	}
}