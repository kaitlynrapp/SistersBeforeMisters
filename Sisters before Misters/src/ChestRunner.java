import java.util.ArrayList;
import java.util.Collections;
public class ChestRunner
	{
		static ArrayList<Chest> cards = new ArrayList<Chest>();
		public static void Chest()
			{
			
				//done
				cards.add(new Chest("You went to the movies pay $50", -50));
				cards.add(new Chest("You stole snacks pay $100", -100));
				cards.add(new Chest("You bought Disney Stock earn $200", +200));
				cards.add(new Chest("You went to the disney store pay $400", -400));
				cards.add(new Chest("You went to disneyland pay $300", -300));
				cards.add(new Chest("You stole mickey mouse pay $600", -600));
				cards.add(new Chest("You bought Frozen pay $50", -50));
				cards.add(new Chest("You got a subscription to Disney+, pay $100", -100));
				cards.add(new Chest("You sold disney merch earn $100", +100));
			}
		public static void shuffle()
			{
			Collections.shuffle(cards);
			}
				
			
	}
