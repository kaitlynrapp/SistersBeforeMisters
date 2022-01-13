import java.util.ArrayList;
public class ChanceRunner
	{

		public static void Chance()
			{
				ArrayList<Chance> cards = new ArrayList<Chance>();
				
				cards.add(new Chance("Go back three spaces", -3, 0));
				cards.add(new Chance("Collect $200!", 0, 200));
				cards.add(new Chance("You Lost $200", 0, -200));
				cards.add(new Chance("Go forward three spaces", 3, 0));
				cards.add(new Chance("Collect $300 and move forward two spaces", 2, 300));
				cards.add(new Chance("Lose $100 and move backward two spaces", 2, -100));
				cards.add(new Chance("Collect $100 and move forward one space", 1, 100));
				cards.add(new Chance("Move back two spaces", -2, 0));
				cards.add(new Chance("Lose $600", 0, -600));
				cards.add(new Chance("Move foward ten spaces", 10,0));
				
			}

	}
