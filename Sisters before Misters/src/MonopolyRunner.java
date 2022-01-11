import java.util.Scanner;


public class MonopolyRunner
	{
		//tester please ignore this comment
		static Scanner input = new Scanner(System.in);
		static String name;
		static String enter;

		public static void main(String[] args)
			{
				introduction();
				

			}
		
		public static void introduction()
		{
			System.out.println("Hello and welcome to Monopoly! ");
			System.out.println("What is your name? ");
			name = input.nextLine();
			System.out.println("Welcome " + name + "!!");
			System.out.println("Press enter to start the game");
			enter = input.nextLine();
			
			
		}

	}
