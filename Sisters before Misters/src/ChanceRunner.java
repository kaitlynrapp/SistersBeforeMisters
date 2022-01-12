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
				
			}

	}
