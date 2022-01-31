import java.util.Scanner;


public class ShowInventory
	{
		static Scanner userChoice = new Scanner(System.in);
		static String choice;
		public static void ShowInventory()
			{
				
		System.out.println("\nWhat would you like to see?");
		System.out.println("1.   Balance");
		System.out.println("2.   Place");
		System.out.println("3.   Properties Owned");
		System.out.println("4.   Continue Playing");
		System.out.println("5.   Reverse the Board at place 20");
		System.out.println("6.   Go to jail");
		choice = userChoice.nextLine();
		
		if (choice.equals("1"))
			{
				showBalance();
			}
		else if (choice.equals("2"))
			{
				showPlace();
			}
		else if (choice.equals("3"))
			{
				showProperties();
			}
		else if (choice.equals("4"))
			{
				MoveAround.startMoving();
			}
		else if (choice.equals("5"))
			{
				MonopolyRunner.player1.setPlace(20);
				MoveAround.newPlace = (MonopolyRunner.player1.getPlace());
				System.out.println("You landed on: " + BoardArrayList.boardList.get(MoveAround.newPlace).getName());
				MoveAround.doAction();
				//kMoveAround.startMoving();
			}
		else if (choice.equals("6"))
			{
				MonopolyRunner.player1.setPlace(10);
				MoveAround.newPlace = (MonopolyRunner.player1.getPlace());
				System.out.println("You landed on: " + BoardArrayList.boardList.get(MoveAround.newPlace).getName());
				MoveAround.doAction();
				//kMoveAround.startMoving();
			}
		else
			{
				System.out.println("That isnt a choice.");
				ShowInventory();
			}
		
			}
		public static void showBalance()
		{
			System.out.println("Your balance is: " + MonopolyRunner.player1.getBalance() + " ");
		}
		
		public static void showPlace()
		{
			System.out.println("Your place is: " + MonopolyRunner.player1.getPlace() + " ");
		}
		
		public static void showProperties()
		{
			int counter = 1;
			System.out.println("\nYou own: ");
			for(int i = 0; i < BoardArrayList.playerOneProperties.size(); i++)
				{
				System.out.println(counter + ".  " + BoardArrayList.playerOneProperties.get(i).getName());
				counter++;
				}
			System.out.println("\n");
		}
	}
