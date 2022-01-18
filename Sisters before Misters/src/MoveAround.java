import java.util.Scanner;
import java.util.ArrayList;


public class MoveAround
	{


		static Scanner input = new Scanner(System.in);
		static String enter2;
		static int newPlace;
		static String space;
		static int balanceNew;
		
		static int chanceMove;
		static int chanceBalance;
		
		public static void startMoving()
			{
				System.out.println("OK let's roll the dice");
				System.out.println("Press enter to roll");
				enter2 = input.nextLine();
				
				Dice.rollDice();
				moveSpaces();
				doAction();
				
			}


		
		public static void moveSpaces()
		{
			BoardArrayList.fillList();
			newPlace = MonopolyRunner.player1.getPlace() + Dice.diceRoll;
			System.out.println("You landed on: " + BoardArrayList.boardList.get(newPlace).getName());
			MonopolyRunner.player1.setPlace(newPlace);
		}
		
		public static void doAction()
		{

			if(newPlace == 2 || newPlace == 16 || newPlace == 27)
				{
					//chance
					ChanceRunner.shuffle();
					
					System.out.println("You picked up: ");
					ChanceRunner.Chance();
		
					//set place to current place + or - 
					chanceMove = ChanceRunner.cards.get(0).getChangePlace();
//					MonopolyRunner.player1.setPlace(MonopolyRunner.player1.getPlace() + chanceMove);
//					System.out.println("You are now on " + MonopolyRunner.player1.getPlace() );
					
					//set money
					chanceBalance = ChanceRunner.cards.get(0).getMoney();
					MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() + chanceBalance);
					System.out.println("Your balance is: " + MonopolyRunner.player1.getBalance());
					
				}
			else if(newPlace == 10)
				{
					//go to jail 
					System.out.println("You are now in jail");
					MonopolyRunner.player1.setPlace(30);
				}
			else if(newPlace == 13 || newPlace == 22 || newPlace == 37)
				{
					//community chest
					ChestRunner.shuffle();
					
					System.out.println("You picked up: ");
					ChestRunner.Chest();
				}
			else if(newPlace == 18)
				{
					//luxury tax
					System.out.println("You have to pay 100");
					MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() + 100);
					System.out.println("Your new balance is " + MonopolyRunner.player1.getBalance());
										
				}
			else if(newPlace == 20)
				{
					//free parking
					System.out.println("You get a free space");
				}
			else if(newPlace == 24)
				{
					//income tax
					System.out.println("You have to pay 200");
					MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() + 200);
					System.out.println("Your new balance is " + MonopolyRunner.player1.getBalance());
				}
			else if(newPlace == 30)
				{
					//jail
					System.out.println("You are visiting jail");
				}
			else if(newPlace == 0)
				{
					//go method goes here
					PassGo.PassGo();
				}
			else
				{
					//all the other properties
					Prices.checkPrices();
				}
		}
		
		

	}
