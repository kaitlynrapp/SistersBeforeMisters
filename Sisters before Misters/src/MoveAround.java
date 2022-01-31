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
		static int diceOne;
		static int diceTwo;
		static String jailRoute;
		static boolean clockwise = true;
		
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
			
			
			//if (MonopolyRunner.reverse = false)
				//{
					//newPlace = MonopolyRunner.player1.getPlace() - Dice.diceRoll;
					//if(newPlace < 0)
						//{
						//newPlace = newPlace + 40;	
						//MonopolyRunner.player1.setPlace(newPlace);
						//}
					//MonopolyRunner.player1.setPlace(newPlace);
				//}
			//else
				//{
					
					
			//MonopolyRunner.player1.setPlace((MonopolyRunner.player1.getPlace() + diceRoll) - 39);
			
			//if(MonopolyRunner.player1.getPlace() > 39)
				//{
					//MonopolyRunner.player1.setPlace(MonopolyRunner.player1.getPlace() - 40);
			
			//trying to figure out if works
			
			//if(enter2.equals("e"))
				//{
			//MonopolyRunner.player1.setPlace(20);
			//MoveAround.newPlace = (MonopolyRunner.player1.getPlace());
				//}
			
				
			System.out.println("You landed on: " + BoardArrayList.boardList.get(newPlace).getName());
			MonopolyRunner.player1.setPlace(newPlace);
				
		}
			
		//}
		
		public static void doAction()
		{
			
			//else
				//{
			if(MonopolyRunner.player1.getPlace() == 0)
				{
					//go method goes here
					//PassGo.PassGo();
					MonopolyRunner.player1.setPlace(0 + Dice.diceRoll);
				}

			else if(MonopolyRunner.player1.getPlace() == 2 || MonopolyRunner.player1.getPlace() == 22 || MonopolyRunner.player1.getPlace() == 27)


				{
					//chance
					ChanceRunner.shuffle();
					
					System.out.println("You picked up: ");
					ChanceRunner.Chance();
		
					//set place to current place + or - 
					chanceMove = ChanceRunner.cards.get(0).getChangePlace();
					MonopolyRunner.player1.setPlace(MonopolyRunner.player1.getPlace() + chanceMove);
					//for()
					System.out.println("\nYou are now on " + MonopolyRunner.player1.getPlace() );
					
					//set money
					chanceBalance = ChanceRunner.cards.get(0).getMoney();
					MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() + chanceBalance);
					System.out.println("Your balance is: " + MonopolyRunner.player1.getBalance());
					
				}
			else if(MonopolyRunner.player1.getPlace() == 10)
				{
					//go to jail 
					System.out.println("You are now in jail");
					MonopolyRunner.player1.setPlace(30);
					getOutOfJail();
					
				}
			else if(MonopolyRunner.player1.getPlace() == 33 || MonopolyRunner.player1.getPlace() == 17)
				{
					//community chest
					ChestRunner.shuffle();
					
					System.out.println("You picked up: \n");
					ChestRunner.Chest();
					MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() - 100);
				}
	
			else if(MonopolyRunner.player1.getPlace() == 20)
				{
					//free parking and reverse
					System.out.println("You get a free space");
					clockwise = false;
					System.out.println("And you will reverse");
					
				}
			else if(MonopolyRunner.player1.getPlace() == 4)
				{
					//income tax
					System.out.println("You have to pay 200");
					MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() - 200);
					System.out.println("Your new balance is " + MonopolyRunner.player1.getBalance());
				}
			else if(MonopolyRunner.player1.getPlace() == 30)
				{
					//jail
					System.out.println("You are visiting jail");
				}
			
			else
				{
					//all the other properties
					Prices.checkPrices();
					//MonopolyRunner.player1.setPlace(20);
				}
				}
			
		//}
		
		public static void getOutOfJail()
		{
			//diceOne = (int) (Math.random()* 6)  + 1;
			//diceTwo = (int) (Math.random()* 6)  + 1;	
			
			System.out.println("You can choose: ");
			System.out.println("(1) Pay fine $100 to get out");
			System.out.println("(2) Attempt to roll doubles (3 tries)");
			jailRoute = input.nextLine();
			
			if(jailRoute.equals("1"))
				{
					System.out.println("You loose $100");
					MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() - 100);
				}
			else if(jailRoute.equals("2"))
				{
					System.out.println("Press enter to roll the dice.");
					enter2 = input.nextLine();
					
					Dice.rollDice();
					if(Dice.dice1 == Dice.dice2)
						{
							System.out.println("Congrats you rolled double " + Dice.dice1 + "'s.");
							System.out.println("You are now out of jail.");
						}
					else 
						{
							
							System.out.println("You rolled a " + Dice.dice1 + " and a " + Dice.dice2 + ". Press enter to roll the dice again.");
							enter2 = input.nextLine();
							Dice.rollDice();
							if(Dice.dice1 == Dice.dice2)
								{
									System.out.println("Congrats you rolled double " + Dice.dice1 + "'s.");
								}
							else 
								{
									
									System.out.println("You rolled a " + Dice.dice1 + " and a " + Dice.dice2 + ". Press enter to roll the dice again.");
									enter2 = input.nextLine();
									
									Dice.rollDice();
									if(Dice.dice1 == Dice.dice2)
										{
											System.out.println("Congrats you rolled double " + Dice.dice1 + "'s.");
										}
									else 
										{
											
											
											System.out.println("You rolled a " + Dice.dice1 + " and a " + Dice.dice2 + ". You loose $100");
											MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() - 100);
											
						}
				
				}
		}
		
		
				}
		}
		
		
		
	}
