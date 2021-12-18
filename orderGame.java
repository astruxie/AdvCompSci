/*****-[Samantha J. Noggle]-*****
 **********-[Period 6]-**********
 *********--[03/06/19]--*********
 **-[This is my own work SJN]-**
 * -[Game that makes the user order things correctly.]-*/

import java.util.*;

public class orderGame{
	public static void main(String[]args){
		//variables
		String playerArray[10];
		String finalArray[10] = {"Chicken", "Capn Crunch", "Sushi", "Spaghetti", "Mac n Cheese", "Caesar Salad", "Escargot", "Pizza", "Kale"};
		String choice;
		Scanner scanner = new Scanner(System.in);
		Stack stack1 = new Stack("Sushi", "Spaghetti", "Lasagna", "Escargot");
		Stack stack2 = new Stack("Chicken", "Caesar Salad", "Kale");
		Stack stack3 = new Stack("Capn Crunch", "Mac n Cheese", "Pizza");
		boolean flag = true;

		Stack playerStack = new Stack();
		//begin game i guess
		System.out.println("\nWelcome to the Ordering Game!");
		System.out.println("\nPlease order these foods from best to worst");
		for (int i = 0; i < 10; i++){
		System.out.println("\n Type the food that you think is the best out of the three!");
		System.out.println(stack1.peek());
		System.out.println(stack2.peek());
		System.out.println(stack3.peek());
		choice = reader.nextLine();
		//check which stack i guess
		if (stack1.peek() == choice){
			System.out.println(stack1.peek() + "Has been chosen");
			stack1.pop() = playerArray[i]

		}
		else if (stack2.peek() == choice){
			System.out.println(stack2.peek() + "Has been chosen");
		stack2.pop() = playerArray[i]
		}
		else if (stack3.peek() == choice){
			System.out.println(stack3.peek() + "Has been chosen");
		stack3.pop() = playerArray[i]
		}
		}
		//check if arrays match i guess
		for (int x = 0; x < 10; x++){
			while (flag = true){
				if (!playerArray[x].equals(finalArray[x])){
					flag = false;
					System.out.println("O no you messed up lolol!");
				}
			}
		}
	}
}