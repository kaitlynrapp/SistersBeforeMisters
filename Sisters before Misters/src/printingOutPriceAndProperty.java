
public class printingOutPriceAndProperty
	{
	public static int place = MonopolyRunner.player1.getPlace();
	public static int balance = MonopolyRunner.player1.getBalance();
	public static void PullPrice()
		{
		BoardArrayList.fillList();
		System.out.println("You have $" + balance + " in your balance");
		listProperties();
		
		}
	public static void listProperties()
	{
	if(place == 1)
		{
		//ramones body shop	
		System.out.println("You landed on Ramones Body Shop. It costs $50");
		
		}
	else if(place == 3)
		{
		//flos v8 cafe	
		System.out.println("You landed on flos v8 cafe. It costs $50");
		}	
	else if(place == 4)
		{
		//cozy cone cafe	
		System.out.println("You landed on cozy cone cafe. It costs $50");
		}	
	else if(place == 36)
		{
		//Savanna Central
		System.out.println("You landed on Savanna Central. It costs $400");
		}	
	else if(place == 38)
		{
		//bunny burrow
		System.out.println("You landed on bunny burrow. It costs $400");
		}	
	else if(place == 39)
		{
		//tundra town	
		System.out.println("You landed on tundra town. It costs $400");
		}	
	else if(place == 6)
		{
		//chateau de chambord	
		System.out.println("You landed on chateau de chambord. It costs $100");
		}	
	else if(place == 7)
		{
		//belles house
		System.out.println("You landed on belles house. It costs $100");
		}	
	
	else if(place == 9)
		{
		//the beasts library
		System.out.println("You landed on the beasts library. It costs $100");
		}	
	else if(place == 11)
		{
		//pride rock
		System.out.println("You landed on pride rock. It costs $150");
		}	
	else if(place == 12)
		{
		//tree of life	
		System.out.println("You landed on tree of life	. It costs $150");
		}	
	else if(place == 14)
		{
		//elephant graveyard	
		System.out.println("You landed on elephant graveyard. It costs $150");
		}	
	else if(place == 17)
		{
		//arendelle palace	
		System.out.println("You landed on arendelle palace. It costs $200");
		}	
	else if(place == 19)
		{
		//ice palace
		System.out.println("You landed on ice palace. It costs $200");
		}	
	
	else if(place == 26)
		{
		//tianas palace
		System.out.println("You landed on tianas palace. It costs $300");
		}	
	else if(place == 28)
		{
		//the bayou
		System.out.println("You landed on the bayou. It costs $300");
		}	
	else if(place == 29)
		{
		//dr. Faciliers Magic Shop	
		System.out.println("You landed on Dr.Faciliers Magic Shop. It costs $300");
		}	
	else if(place == 21)
		{
		//The Sultans Palace
		System.out.println("You landed on The Sultans Palace. It costs $250");
		}	
	else if(place == 23)
		{
		//Cave of wonders	
		System.out.println("You landed on Cave of wonders. It costs $250");
		}	
	else if(place == 31)
		{
		//the Ugly Duckling Tavern
		System.out.println("You landed on the Ugly Duckling Tavern. It costs $350");
		}	
	
	else if(place == 33)
		{
		//Corona Town Square	
		System.out.println("You landed on Corona Town Square. It costs $350");
		}	
	else if(place == 34)
		{
		//the tower
		System.out.println("You landed on the tower. It costs $350");
		}
	}
	}
