import java.util.Scanner;
import java.awt.Choice;
import java.util.ArrayList;

public class MonopolyRunner
	{
		// tester please ignore this comment
		static Scanner input = new Scanner(System.in);
		static String name;
		static String themeChoice;
		static String enter;
		static Player player1;
		static Player player2;
		public static boolean stillPlaying = true;

		public static void main(String[] args)
			{
				
				//MoveAround.getOutOfJail();
				
				
				ChestRunner.shuffle();
				ChanceRunner.shuffle();
				introduction();
				while(stillPlaying = true)
					{
						
						MoveAround.startMoving();
						
						if(MonopolyRunner.player1.getBalance() <= 0)
							{
								System.out.println("You ran out of money, the game is over");
								stillPlaying = false;
								System.exit(0);
							}
						
						
						
							}
				System.out.println("Game Over");
						
					}
				


			

		public static void introduction()
			{

			System.out.println("Hello! 		Let's play some Monopoly! ");
			System.out.println("		What is your name Player? ");
			name = input.nextLine();
			player1 = new Player(name, 1500, 0);
			System.out.println("\nWelcome " + name + "!!");
			System.out.println("You start with $1500");
			System.out.println("Press enter to start the game");
			enter = input.nextLine();
			System.out.println("What theme would you like to play?");
			System.out.println("(1) Traditional Monopoly");
			System.out.println("(2) Disnopoly");
			themeChoice = input.nextLine();
			
			if (themeChoice.equals("1"))
				{
					BoardArrayList.fillListTraditional();	
				}
			else if (themeChoice.equals("2"))
				{
					BoardArrayList.fillListDisnopoly();
				}
			else
				{
					System.out.println("That isn't a choice. Restart\n");
					introduction();
				}
			
			}

		//public static void PassGoMain()
			{

				// if(MoveAround.place == 0)

				//if (MonopolyRunner.player1.getPlace() == 0)
					//{
						//PassGo.PassGo();
					//}

			}
		

	}
