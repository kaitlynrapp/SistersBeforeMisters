import java.util.ArrayList;
import java.util.Collections;
public class ChestRunner
	{
		static ArrayList<Chest> cards = new ArrayList<Chest>();
		public static void Chest()
			{
			
				//done
				cards.add(new Chest("You went to the movies pay $100", -50));
				cards.add(new Chest("You invested pay $100", -100));
				cards.add(new Chest("You bought Stock loose $100", +200));
				cards.add(new Chest("You went to the store pay $100", -100));
				cards.add(new Chest("You went to store pay $100", -300));
				cards.add(new Chest("You stole mickey mouse pay $100", -600));
				cards.add(new Chest("You bought more stock pay $100", -50));
				cards.add(new Chest("You got a subscription pay $100", -100));
				cards.add(new Chest("You bought monopoly merch pay $100", +100));
				
				pickCard();
			}
		public static void shuffle()
			{
			Collections.shuffle(cards);
			}
		
		public static void pickCard()
			{
				System.out.println(cards.get(0).getOutput());
			}
				
			
	}
