import java.util.Scanner;
import java.util.ArrayList;


public class MoveAround
	{



		
		static Scanner input = new Scanner(System.in);
		static String enter2;
		static int newPlace;
		static String space;
		static int balanceNew;
		
		public static void startMoving()
			{
				System.out.println("OK let's roll the dice");
				System.out.println("Press enter to roll");
				enter2 = input.nextLine();
				
				Dice.rollDice();
				moveSpaces();
				doAction();


		
		public static void moveSpaces()
		{
			BoardArrayList.fillList();
			newPlace = MonopolyRunner.player1.getPlace() + Dice.diceRoll;
			System.out.println("You landed on - " + BoardArrayList.boardList.get(newPlace).getName());
			MonopolyRunner.player1.setPlace(newPlace);
			
			
			//space = BoardArrayList.boardList.get(newPlace).getName();
			//Property currentSpace = new space;
			
		}
		
		public static void doAction()
		{
			if(newPlace == 0)
				{
					//go
					System.out.println("Collect 200");
					balanceNew = MonopolyRunner.player1.getBalance() + 200;
					MonopolyRunner.player1.setBalance(balanceNew);
				}
			else if(newPlace == 2 || newPlace == 16 || newPlace == 27)
				{
					//chance
				}
			else if(newPlace == 10)
				{
					//jail
				}
			else if(newPlace == 13 || newPlace == 22 || newPlace == 37)
				{
					//community chest
				}
			else if(newPlace == 18)
				{
					//luxury tax
				}
			else if(newPlace == 20)
				{
					//free parking
				}
			else if(newPlace == 24)
				{
					//income tax
				}
			else if(newPlace == 30)
				{
					//jail
				}
			else
				{
					//all the other properties
				}
		}
		
		

	}
