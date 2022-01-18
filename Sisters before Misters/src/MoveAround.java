import java.util.Scanner;
import java.util.ArrayList;


public class MoveAround
	{



		
		static Scanner input = new Scanner(System.in);
		static String enter2;
		static int newPlace;
		
		public static void startMoving()
			{
				System.out.println("OK let's roll the dice");
				System.out.println("Press enter to roll");
				enter2 = input.nextLine();
				
				Dice.rollDice();
				moveSpaces();


		
		public static void moveSpaces()
		{
			BoardArrayList.fillList();
			newPlace = MonopolyRunner.player1.getPlace() + Dice.diceRoll;
			System.out.println("You landed on - " + BoardArrayList.boardList.get(newPlace).getName());
			MonopolyRunner.player1.setPlace(newPlace);
		}
		
		

	}
