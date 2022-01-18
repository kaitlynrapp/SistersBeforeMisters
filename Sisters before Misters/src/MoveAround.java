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
			System.out.println("You landed on: " + BoardArrayList.boardList.get(newPlace).getName());

			MonopolyRunner.player1.setPlace(newPlace);
			
			
			//space = BoardArrayList.boardList.get(newPlace).getName();
			//Property currentSpace = new space;
			
		}
		
		public static void doAction()
		{
			if(newPlace == 0)
				{
					//go method goes here
//					System.out.println("Collect 200");
//					balanceNew = MonopolyRunner.player1.getBalance() + 200;
//					MonopolyRunner.player1.setBalance(balanceNew);
				}
			else if(newPlace == 2 || newPlace == 16 || newPlace == 27)
				{
					//chance
					System.out.println("You picked up: ");
					ChanceRunner.Chance();
					//MonopolyRunner.player1.setPlace(ChanceRunner.cards(0).getChangePlace());
					//MonopolyRunner.player1.setBalance(ChanceRunner.cards(0).getMoney());
				}
			else if(newPlace == 10)
				{
					//go to jail 
					System.out.println("You are now in jail");
					MonopolyRunner.player1.setPlace(10);
				}
			else if(newPlace == 13 || newPlace == 22 || newPlace == 37)
				{
					//community chest
					System.out.println("You picked up: ");
					ChestRunner.Chest();
				}
			else if(newPlace == 18)
				{
					//luxury tax
					System.out.println("You have to pay 100");
					//take balance and print new balance
					
				}
			else if(newPlace == 20)
				{
					//free parking
					System.out.println("You get a free space");
				}
			else if(newPlace == 24)
				{
					//income tax
					//take balance and print new balance
				}
			else if(newPlace == 30)
				{
					//jail
					System.out.println("You are visiting jail");
				}
			else
				{
					//all the other properties
				}
		}
		
		

	}
