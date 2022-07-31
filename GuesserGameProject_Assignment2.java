package in.ineuron.main;

import java.util.Scanner;

class guesser
{
	int guessNum;
	
	public int guessTheNum()
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Guesser-please guess the number");
		
		guessNum=obj.nextInt();
		
		return guessNum;
		
	}
}

class player
{
	int playerNum;
	
	public int playerGuessTheNum()
	{
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Player- please enter the number");
		
		playerNum=obj.nextInt();
		
		return playerNum;
		
	}
}

class umpire
{
	int gNum;
	int p1Num;
	int p2Num;
	int p3Num;
	int p4Num;
	int p5Num;
	
	
	public void getNumberFromGuesser()
	{
		guesser objGuesserRef=new guesser();
		
		gNum=objGuesserRef.guessTheNum();
			
	}
	
	public void getNumberFromPlayers()
	{
		player objPlayer1Ref=new player();
		player objPlayer2Ref=new player();
		player objPlayer3Ref=new player();
		player objPlayer4Ref=new player();
		player objPlayer5Ref=new player();
		
		p1Num=objPlayer1Ref.playerGuessTheNum();
		p2Num=objPlayer2Ref.playerGuessTheNum();
		p3Num=objPlayer3Ref.playerGuessTheNum();
		p4Num=objPlayer4Ref.playerGuessTheNum();
		p5Num=objPlayer5Ref.playerGuessTheNum();
	}
	
	public void compareTheNumber()
	{
		if(gNum>=1 && gNum<=10 && p1Num>=1 && p1Num<=10 && p2Num>=1 && p2Num<=10 && p3Num>=1 && p3Num<=10 && p4Num>=1 && p4Num<=10 && p5Num>=1 && p5Num<=10)
		{
			System.out.println("Congratulation!Entered values by guesser and player are in range");
			
			if(gNum==p1Num)
			{
				if(gNum==p2Num && gNum==p3Num && gNum==p4Num && gNum==p5Num )
				{
					System.out.println("Match Tied..All 5 players have guessed number which is equal to guesser guessed number");
				}
				else if(gNum==p2Num)
				{
					System.out.println("Player 1 and Player 2 have guessed correctly");
				}
				else if(gNum==p3Num)
				{
					System.out.println("Player 1 and Player 3 have guessed correctly");
				}
				else if(gNum==p4Num)
				{
					System.out.println("Player 1 and Player 4 have guessed correctly");
				}
				else if(gNum==p5Num)
				{
					System.out.println("Player 1 and Player 5 have guessed correctly");
				}
				else if(gNum==p2Num && gNum==p4Num && gNum==p5Num)
				{
					System.out.println("Player 1,Player 4,Player 5 and Player 2 have guessed correctly");
				}
				else if(gNum==p3Num && gNum==p4Num && gNum==p5Num)
				{
					System.out.println("Player 1,Player 3,Player 5 and Player 4 have guessed correctly");
				}
				else
				{
					System.out.println("Player 1 have guessed correctly");
				}
			}
			else if(gNum==p2Num)
			{
				if(gNum==p3Num && gNum==p4Num && gNum==p5Num)
				{
					System.out.println("Player 2,Player 3,Player 4 and Player 5 have guessed correctly");
				}
				else if(gNum==p3Num)
				{
					System.out.println("Player 2 and Player 3 have guessed correctly");
				}
				else if(gNum==p4Num)
				{
					System.out.println("Player 2 and Player 4 have guessed correctly");
				}
				else if(gNum==p5Num)
				{
					System.out.println("Player 2 and Player 5 have guessed correctly");
				}
				else
				{
					System.out.println("Player 1 have guessed correctly");
				}
			}
			else if(gNum==p3Num)
			{
				if(gNum==p4Num && gNum==p5Num)
				{
					System.out.println("Player 3,Player 4 and Player 5 have guessed correctly");
				}
				else if(gNum==p4Num)
				{
					System.out.println("Player 3 and Player 4 have guessed correctly");
				}
				else if(gNum==p5Num)
				{
					System.out.println("Player 3 and Player 5 have guessed correctly");
				}
				else
				{
					System.out.println("Player 3 have guessed correctly");
				}
			}
			else if(gNum==p4Num)
			{
				if(gNum==p4Num && gNum==p5Num)
				{
					System.out.println("Player 4 and Player 5 have guessed correctly");
				}
				
				else
				{
					System.out.println("Player 4 have guessed correctly");
				}
			}
			else if(gNum==p5Num)
			{
				System.out.println("Player 5 have guessed correctly");
			}
		}
		else
		{
			System.out.println("Input is out of range.Please try again");
		}
		if(gNum!=p1Num && gNum!=p2Num && gNum!=p3Num && gNum!=p4Num && gNum!=p5Num)
		{
			System.out.println("No one entered same number as guesser.");
		}
		
		
		
	}
	
}

public class GuesserGameProject_Assignment2 {

	public static void main(String[] args) {
		/*
		 * Scope of improvisation: I have improvised below 2 changes as suggested in live class.
		 * 
		 * 1. Define the range for the value passed by guesser and players: Value should be between 0 to 10
		 * 
		 * 2. Adding multiple Players
		
		 */
		
		umpire objUmpireRef=new umpire();
		
		
		objUmpireRef.getNumberFromGuesser();
		objUmpireRef.getNumberFromPlayers();
		objUmpireRef.compareTheNumber();
		

	}

}
