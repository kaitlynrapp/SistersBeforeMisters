import java.util.Scanner;


public class MonopolyRunner
	{
		static Scanner input = new Scanner(System.in);
		static String name;
		static String enter;

		public static void main(String[] args)
			{
				introduction();
			}
		
		public static void introduction()
		{
			System.out.println("Hello and welcome to Disnopoly! ");
			System.out.println("What is your name Player? ");
			name = input.nextLine();
			System.out.println("\nWelcome " + name + "!!");
			System.out.println("Press enter to start the game");
			enter = input.nextLine();
			
			
		}

	}
