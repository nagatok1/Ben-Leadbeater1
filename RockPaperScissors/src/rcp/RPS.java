package rcp;

import java.util.Random;
import java.util.Scanner;

public class RPS 
{
	static int GameCount = 0;
	static int PlayerWins = 0;
	static int CompWins = 0;
	static int Ties = 0;
	static int RockPicked = 0;
	static int PaperPicked = 0;
	static int ScissorsPicked = 0;
	
	Random r = new Random();
	Scanner scanner = new Scanner(System.in);
	
	public static int play(int pChoice, int cChoice)
	{
		int result = 4;
		// 1 = player win
		// 2 = draw
		// 3 = computer win (player lose)
		System.out.println("");
		GameCount++;
		if(pChoice == 1)
		{
			System.out.println("Player chooses Rock.");
			RockPicked++;
			if(cChoice == 1)
			{
				System.out.println("Computer chooses Rock");
				RockPicked++;
				result = 2;//draw
				System.out.println("It's a draw.");
				Ties++;
			}
			if(cChoice == 2)
			{
				System.out.println("Computer chooses Paper.");
				PaperPicked++;
				result = 3;
				System.out.println("Computer Wins.");
				CompWins++;
			}
			if(cChoice == 3)
			{
				System.out.println("Computer chooses Scissors");
				ScissorsPicked++;
				result = 1;
				System.out.println("Player Wins.");
				PlayerWins++;
			}
		}
		if(pChoice == 2)
		{
			System.out.println("Player chooses Paper.");
			PaperPicked++;
			if(cChoice == 1)
			{
				System.out.println("Computer chooses Rock");
				RockPicked++;
				result = 1;
				System.out.println("Player Wins.");
				PlayerWins++;
			}
			if(cChoice == 2)
			{
				System.out.println("Computer chooses Paper.");
				PaperPicked++;
				result = 2;
				System.out.println("It's a draw.");
				Ties++;
			}
			if(cChoice == 3)
			{
				System.out.println("Computer chooses Scissors");
				ScissorsPicked++;
				result = 3;
				System.out.println("Computer Wins.");
				CompWins++;
			}
		}
		if(pChoice == 3)
		{
			System.out.println("Player chooses Scissors");
			ScissorsPicked++;
			if(cChoice == 1)
			{
				System.out.println("Computer chooses Rock");
				RockPicked++;
				result = 3;
				System.out.println("Computer Wins.");
				CompWins++;
			}
			if(cChoice == 2)
			{
				System.out.println("Computer chooses Paper.");
				PaperPicked++;
				result = 1;
				System.out.println("Player Wins.");
				PlayerWins++;
			}
			if(cChoice == 3)
			{
				System.out.println("Computer chooses Scissors");
				ScissorsPicked++;
				result = 2;
				System.out.println("It's a draw.");
				Ties++;
			}
		}
		
		
		return result;
	}
	
	public int GetCompChoice() {
		int x = r.nextInt(3) + 1;
		return x;
	}
	public int GetPlayerChoice() 
	{
		System.out.println("");
		System.out.println("Select a weapon.");
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Scissors");
		System.out.println("4. Print stats.");
		System.out.println("5. Exit");
		System.out.print("Enter a number: ");
		int x = scanner.nextInt();
		if(x == 4)
		{
			printStats();
		}
		if(x == 5)
		{
			System.exit(0);
		}
		return x;
	}
	 
	public void menu()
	{
		int playerChoice = GetPlayerChoice();
		int compChoice = GetCompChoice();
		play(playerChoice, compChoice);
	}
	
	public void printStats()
	{
		System.out.println("");
		System.out.println("Games played: " + this.GameCount);
		System.out.println("Player wins: " +  this.PlayerWins);
		System.out.println("Comp wins: " +  this.CompWins);
		System.out.println("Ties: " + this.Ties);
		System.out.println("Rocks picked: " + this.RockPicked + " " + (this.RockPicked/(GameCount*2.0))*100.0 + "%");
		System.out.println("Scissors picked: " + this.ScissorsPicked + " " + (this.ScissorsPicked/(GameCount*2.0))*100.0 + "%");
		System.out.println("Paper picked: " + this.PaperPicked + " " + (this.PaperPicked/(GameCount*2.0))*100.0 + "%");
	}
}