import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

	
	System.out.println("What is your starting budget?");
 	int startAmount = in.nextInt();
 	
 	System.out.println("What is your chance of winning?");
 	double winChance = in.nextDouble();
 	
 	System.out.println("How much money do you need to stop playing the game?");
 	int winLimit = in.nextInt();
 	
 	while (startAmount < winLimit)
 	{
 		Math.random();
 		if (Math.random() < winChance)
 		{
 		startAmount ++;
 		System.out.println("You Won!");
 		}
 		else
 		{
 		startAmount--;
 		System.out.println("You Lost!");
 		}
 	}
 	
 	System.out.println("You've reached your win limit!");
 	System.out.println("You had a successful day and can leave!");
 	
	}
}
